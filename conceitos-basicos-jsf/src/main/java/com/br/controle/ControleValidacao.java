package com.br.controle;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;



@ManagedBean(name="controleValidacao")
@RequestScoped
public class ControleValidacao implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@NotEmpty(message="O nome deve ser informado")
	@Length(max=40, min=3, message = "O nome deve estar entre {min} e {max} caracteres")
	private String nome;
	
	@NotEmpty(message="O telefone deve ser informado")
	@Pattern(regexp="\\(\\d{2}\\)\\d{5}\\-\\d{4}", message="O formato do telefone deve ser (99)99999-9999")
	private String telefone;
	
	@NotEmpty(message="O email deve ser informado")
	@Email(message="Informe um email valido")
	private String email;
	
	@NotNull(message="A idade deve ser informada")
	@Range(min=12, max=80, message="A idade deve estar entre {min} e {max} anos")
	private Long idade;
	
	@NotNull(message="A nota deve ser informada")
	@Range(min=0, max=10, message="A nota deve ficar entre 0 e 10")
	private Double nota;
	
	public ControleValidacao() {
		
	}
	
	public String processaDados() {
		String saida = "";
		saida += "Nome: " + this.nome;
		saida += " | Telefone: " + this.telefone;
		saida += " | Email: " + this.email;
		saida += " | Idade: " + this.idade;
		saida += " | Nota: " + this.nota;
		
		FacesMessage msg = new FacesMessage(saida);
		FacesContext.getCurrentInstance().addMessage("", msg);
		
		this.nome = "";
		this.telefone = "";
		this.email = "";
		this.idade = null;
		this.nota = null;
		return "formValidacao";
	}
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getIdade() {
		return idade;
	}
	public void setIdade(Long idade) {
		this.idade = idade;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
	
	

}
