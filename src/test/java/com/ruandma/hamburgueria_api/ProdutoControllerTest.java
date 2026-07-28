package com.ruandma.hamburgueria_api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ruandma.hamburgueria_api.model.Produto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class ProdutoControllerTest {

    @Autowired
    MockMvc mockMvc;
    @Autowired
    ObjectMapper objectMapper;

    @Test
    void deveCriarProdutoCom201() throws Exception {
        Produto p = new Produto("X-Burger Clássico", "Pão brioche, blend 180g", 29.90);

        mockMvc.perform(post("/produtos")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(p)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").exists())
                .andExpect(jsonPath("$.nome").value("X-Burger Clássico"));
    }

    @Test
    void deveRetornar400QuandoNomeVazio() throws Exception {
        Produto p = new Produto("", "Sem nome", 10.0);

        mockMvc.perform(post("/produtos")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(p)))
                .andExpect(status().isBadRequest());
    }

    @Test
    void deveRetornar400QuandoPrecoNegativo() throws Exception {
        Produto p = new Produto("X-Burger", "Preço inválido", -5.0);

        mockMvc.perform(post("/produtos")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(p)))
                .andExpect(status().isBadRequest());
    }
}