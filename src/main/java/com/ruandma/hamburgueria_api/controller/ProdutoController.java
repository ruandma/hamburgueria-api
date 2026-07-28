package com.ruandma.hamburgueria_api.controller;

import com.ruandma.hamburgueria_api.model.Produto;
import com.ruandma.hamburgueria_api.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private final ProdutoRepository repository;
    public ProdutoController(ProdutoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Produto> listar() { return repository.findAll(); }

    @PostMapping
    public Produto criar(@RequestBody Produto produto) { return repository.save(produto); }
}