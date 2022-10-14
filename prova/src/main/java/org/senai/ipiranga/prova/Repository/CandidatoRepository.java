package org.senai.ipiranga.prova.Repository;


import java.util.Optional;

import org.senai.ipiranga.prova.model.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatoRepository extends JpaRepository<Candidato, Long> {
	public Optional<Candidato> findByCandidato(String nome_candidato);
}
