package com.ruandma.hamburgueria_api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class ProdutoRequestDTO {
    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @NotNull(message = "Preço é obrigatório")
    @Positive(message = "Preço deve ser positivo")
    private Double preco; // SEU MODEL USA DOUBLE, NÃO BIGDECIMAL

    private String descricao;
}