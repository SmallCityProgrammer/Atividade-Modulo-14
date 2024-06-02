package com.projeto.integrado.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.integrado.entity.Recurso;

public interface RecursoRepository extends JpaRepository<Recurso, Long> {
    List<Recurso> findByNome(String nome);
}