package com.lopesempresa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.lopesempresa.enums.Perfil;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@JsonTypeName("cliente")
public class Cliente extends Pessoa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Cliente(Integer idUsuario, String nome, LocalDate dataNascimento, String cpf, String senha, String email) {
		super(idUsuario, nome, dataNascimento, cpf, senha, email);
		addPerfil(Perfil.CLIENTE);
	}

	public Cliente() {
		super();
	}
	
	
}
