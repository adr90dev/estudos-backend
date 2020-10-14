package com.minhaescola.MinhaEscola.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaescola.MinhaEscola.model.Turma;

public interface TurmaRepository extends JpaRepository<Turma, Long>{
	public List<Turma> findAllByDescricaoContainingIgnoreCase (String descricao);
}
