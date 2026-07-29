package com.ruandma.hamburgueria_api.controller;

import com.ruandma.hamburgueria_api.dto.ProdutoRequestDTO;
import com.ruandma.hamburgueria_api.dto.ProdutoResponseDTO;
import com.ruandma.hamburgueria_api.model.Produto;
import com.ruandma.hamburgueria_api.services.ProdutoService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
@RequiredArgsConstructor
@SecurityRequirement(name = "bearerAuth")
public class ProdutoController {

    private final ProdutoService service;

    @GetMapping
    public Page<ProdutoResponseDTO> listar(Pageable pageable) {
        return service.listarTodos(pageable).map(ProdutoResponseDTO::fromEntity);
    }

    @GetMapping("/{id}")
    public ProdutoResponseDTO buscarPorId(@PathVariable Long id) {
        return ProdutoResponseDTO.fromEntity(service.buscarPorId(id));
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<ProdutoResponseDTO> criar(@Valid @RequestBody ProdutoRequestDTO dto) {
        Produto novo = new Produto();
        novo.setNome(dto.getNome());
        novo.setPreco(dto.getPreco());
        novo.setDescricao(dto.getDescricao());
        Produto salvo = service.salvar(novo);
        return ResponseEntity.status(HttpStatus.CREATED).body(ProdutoResponseDTO.fromEntity(salvo));
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ProdutoResponseDTO atualizar(@PathVariable Long id, @Valid @RequestBody ProdutoRequestDTO dto) {
        Produto atualizado = service.atualizar(id, dto);
        return ProdutoResponseDTO.fromEntity(atualizado);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}