package com.ruandma.hamburgueria_api.dto;

import com.ruandma.hamburgueria_api.model.Produto;
import lombok.Data;

@Data
public class ProdutoResponseDTO {
    private Long id;
    private String nome;
    private Double preco;
    private String descricao;

    public static ProdutoResponseDTO fromEntity(Produto p) {
        ProdutoResponseDTO dto = new ProdutoResponseDTO();
        dto.setId(p.getId());
        dto.setNome(p.getNome());
        dto.setPreco(p.getPreco());
        dto.setDescricao(p.getDescricao());
        return dto;
    }
}