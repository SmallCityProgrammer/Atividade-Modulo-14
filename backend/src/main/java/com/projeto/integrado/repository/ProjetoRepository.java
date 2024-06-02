package com.projeto.integrado.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.integrado.entity.Projeto;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
    List<Projeto> findByDescricao(String descricao);
}