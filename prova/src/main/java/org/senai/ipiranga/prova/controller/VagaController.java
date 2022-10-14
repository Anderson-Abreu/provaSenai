package org.senai.ipiranga.prova.controller;

import java.util.List;

import org.senai.ipiranga.prova.Repository.CandidatoRepository;
import org.senai.ipiranga.prova.Repository.VagaRepository;
import org.senai.ipiranga.prova.model.Candidato;
import org.senai.ipiranga.prova.model.Vaga;
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
public class VagaController {

	@Autowired
	private VagaRepository repository;
	
	
	@GetMapping
	public ResponseEntity<List<Vaga>> GetAll() {
		return ResponseEntity.ok(repository.findAll());
	}


	@PostMapping("/cadastrar")
	public ResponseEntity<Vaga> Post(@RequestBody Vaga vaga) {
		return (ResponseEntity<Vaga>) ResponseEntity.status(HttpStatus.CREATED);
				
	}

	@PutMapping
	public ResponseEntity<Vaga> Put(@RequestBody Vaga Vaga) {
		return ResponseEntity.ok(repository.save(Vaga));
	}
	
}
