package org.senai.ipiranga.prova.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vaga")
public class Candidato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String email;
	
	private String nome_candidato;
	
	private String rg;
	
	private long vaga_codigo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome_candidato() {
		return nome_candidato;
	}

	public void setNome_candidato(String nome_candidato) {
		this.nome_candidato = nome_candidato;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public long getVaga_codigo() {
		return vaga_codigo;
	}

	public void setVaga_codigo(long vaga_codigo) {
		this.vaga_codigo = vaga_codigo;
	}
	
	
}
