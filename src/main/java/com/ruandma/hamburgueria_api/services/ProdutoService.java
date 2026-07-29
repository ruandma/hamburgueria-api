package com.ruandma.hamburgueria_api.services; // COM S NO FINAL

import com.ruandma.hamburgueria_api.dto.ProdutoRequestDTO;
import com.ruandma.hamburgueria_api.model.Produto;
import com.ruandma.hamburgueria_api.repository.ProdutoRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoRepository repository;

    public Page<Produto> listarTodos(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Produto buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Produto não encontrado com id: " + id));
    }

    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }

    public Produto atualizar(Long id, ProdutoRequestDTO dto) {
        Produto produtoExistente = buscarPorId(id);
        produtoExistente.setNome(dto.getNome());
        produtoExistente.setPreco(dto.getPreco());
        produtoExistente.setDescricao(dto.getDescricao());
        return repository.save(produtoExistente);
    }

    public void deletar(Long id) {
        Produto produto = buscarPorId(id);
        repository.delete(produto);
    }
}