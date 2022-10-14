package org.senai.ipiranga.prova.Repository;

import java.util.Optional;

import org.senai.ipiranga.prova.model.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VagaRepository extends JpaRepository<Vaga, Long> {
	public Optional<Vaga> findByVaga(String nome);
}
