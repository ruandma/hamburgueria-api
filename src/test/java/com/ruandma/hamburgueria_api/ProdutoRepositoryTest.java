package com.ruandma.hamburgueria_api;

import com.ruandma.hamburgueria_api.model.Produto;
import com.ruandma.hamburgueria_api.repository.ProdutoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class ProdutoRepositoryTest {

    @Autowired
    ProdutoRepository repository;

    @Test
    void deveSalvarProduto() {
        Produto p = new Produto("X-Burger Teste", "Teste", 29.90);

        Produto salvo = repository.save(p);

        assertThat(salvo.getId()).isNotNull();
        assertThat(repository.count()).isEqualTo(1);
    }
}