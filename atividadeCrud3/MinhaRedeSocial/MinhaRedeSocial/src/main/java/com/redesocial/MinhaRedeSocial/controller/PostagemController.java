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

import com.redesocial.MinhaRedeSocial.model.Postagem;
import com.redesocial.MinhaRedeSocial.repository.PostagemRepository;

@RequestMapping("/postagem")
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PostagemController {

	@Autowired
	public PostagemRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Postagem>>getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id_postagem}")
	public ResponseEntity<Postagem> getById (@PathVariable long id_postagem){
		return repository.findById(id_postagem).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());//.map é o método usado para varrer o optional
	}
	
	@GetMapping("/texto/{texto}")
	public ResponseEntity<List<Postagem>> getByTexto(@PathVariable String texto){
		return ResponseEntity.ok(repository.findAllByTextoContainingIgnoreCase(texto));
	}
	
	@PostMapping
	public ResponseEntity<Postagem> post (@RequestBody Postagem postagem){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
	}
	
	@PutMapping
	public ResponseEntity<Postagem> put (@RequestBody Postagem postagem){
		return ResponseEntity.ok(repository.save(postagem));
	}
	
	@DeleteMapping("/{id_postagem}")
	public void delete (@PathVariable long id_postagem) {
		repository.deleteById(id_postagem);
	}
	
}
