package com.minhaescola.MinhaEscola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minhaescola.MinhaEscola.model.Turma;
import com.minhaescola.MinhaEscola.repository.TurmaRepository;

@RestController
@RequestMapping("/turma")
@CrossOrigin("*")
public class TurmaController {
	
	@Autowired//qual a função?
	private TurmaRepository repository;//qual a função?

	 @GetMapping//qual a função?
	 public ResponseEntity<List<Turma>> GetAll(){
		 return ResponseEntity.ok(repository.findAll());//qual a função?
	 }
	 
	 @GetMapping("/{id}")
	 public ResponseEntity<Turma> GetById(@PathVariable long id){
		 return repository.findById(id)
				 .map(resp -> ResponseEntity.ok(resp))
				 .orElse(ResponseEntity.notFound().build());
	 }
	 
	 @GetMapping("/decricao/{descricao}")
	 public ResponseEntity<List<Turma>> GetByDescricao(@PathVariable String descricao){
		 return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(descricao));
	 }
	 
	 @PostMapping
	 public ResponseEntity<Turma> post (@RequestBody Turma turma){
		 return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(turma));
	 }
	 
	 @PutMapping
	 public ResponseEntity<Turma> put (@RequestBody Turma turma){
		 return ResponseEntity.status(HttpStatus.OK).body(repository.save(turma));
	 }
	 
	 @DeleteMapping("/{id}")
	 public void delete(@PathVariable long id) {
		 repository.deleteById(id);
	 }
	
}
