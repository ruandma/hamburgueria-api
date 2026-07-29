package com.ruandma.hamburgueria_api.controller;

import com.ruandma.hamburgueria_api.model.User;
import com.ruandma.hamburgueria_api.repository.UserRepository;
import com.ruandma.hamburgueria_api.security.JwtService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequest req) {
        User user = new User();
        user.setUsername(req.getUsername());
        user.setPassword(passwordEncoder.encode(req.getPassword()));
        user.setRole(req.getRole() != null ? req.getRole() : User.Role.ROLE_USER);
        userRepository.save(user);
        String token = jwtService.generateToken(user);
        return ResponseEntity.ok(token);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest req) {
        authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(req.getUsername(), req.getPassword())
        );
        User user = userRepository.findByUsername(req.getUsername()).orElseThrow();
        String token = jwtService.generateToken(user);
        return ResponseEntity.ok(token);
    }

    @Data static class RegisterRequest { String username; String password; User.Role role; }
    @Data static class LoginRequest { String username; String password; }
}