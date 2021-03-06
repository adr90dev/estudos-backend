package com.redesocial.MinhaRedeSocial.controller;

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

import com.redesocial.MinhaRedeSocial.model.Tema;
import com.redesocial.MinhaRedeSocial.repository.TemaRepository;

@RestController
@RequestMapping("/tema")
@CrossOrigin("*")
public class TemaController {
	
	@Autowired
	public TemaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Tema>>getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id_tema}")
	public ResponseEntity<Tema>getById (@PathVariable long id_tema){
		return repository.findById(id_tema)
				.map(resp -> ResponseEntity.ok(resp))
					.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/tema/{tema}")
	public ResponseEntity<List<Tema>> getByDescricao(@PathVariable String descricao){
		return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(descricao));
	}
	
	 @PostMapping
	 public ResponseEntity<Tema> post (@RequestBody Tema tema){
		 return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(tema));
	 }
	 
	 @PutMapping
	 public ResponseEntity<Tema> put (@RequestBody Tema tema){
		 return ResponseEntity.status(HttpStatus.OK).body(repository.save(tema));
	 }
	 
	 @DeleteMapping("/{id_tema}")
	 public void delete(@PathVariable long id_tema) {
		 repository.deleteById(id_tema);
	 }
	
}
