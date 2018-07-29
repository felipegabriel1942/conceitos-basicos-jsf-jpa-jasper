package com.br.modelo;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;


public class Pessoa implements Serializable{

	private static final long serialVersionUID = -958340649469635420L;
	
	private Integer id;
	
	@NotEmpty(message="O nome deve ser informado")
	@Length(max=40, message="O nome não pode ter mais que {max} caracteres")
	private String nome;
	
	@NotEmpty(message="O nome deve ser informado")
	@Email(message="Informe um email valido")
	private String email;
		
	public Pessoa() {
		
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
