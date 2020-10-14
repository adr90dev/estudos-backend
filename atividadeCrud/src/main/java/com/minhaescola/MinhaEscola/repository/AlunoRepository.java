package com.minhaescola.MinhaEscola.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaescola.MinhaEscola.model.Aluno;
import com.minhaescola.MinhaEscola.model.Turma;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	public List<Turma> findAllByNomeContainingIgnoreCase(String nome);

}
