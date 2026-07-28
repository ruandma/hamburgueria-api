package com.ruandma.hamburgueria_api.repository;

import com.ruandma.hamburgueria_api.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {}