package org.senai.ipiranga.prova.controller;

import java.util.List;
import java.util.Optional;

import org.senai.ipiranga.prova.Repository.CandidatoRepository;
import org.senai.ipiranga.prova.model.Candidato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidato")
@CrossOrigin("*")
public class CandidatoController {
	@Autowired
	private CandidatoRepository repository;
	
	
	@GetMapping
	public ResponseEntity<List<Candidato>> GetAll() {
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Candidato> GetById(@PathVariable long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}


	@PostMapping("/cadastrar")
	public ResponseEntity<Candidato> Post(@RequestBody Candidato candidato) {
		return (ResponseEntity<Candidato>) ResponseEntity.status(HttpStatus.CREATED);
				
	}

	@PutMapping
	public ResponseEntity<Candidato> Put(@RequestBody Candidato Candidato) {
		return ResponseEntity.ok(repository.save(Candidato));
	}

}
