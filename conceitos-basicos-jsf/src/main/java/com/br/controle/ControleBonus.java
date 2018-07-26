package com.br.controle;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "controleBonus")
@RequestScoped
public class ControleBonus implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String nome;
	private Double salario;
	private Double bonus;
	private Integer cargo;
	
	public ControleBonus() {
		
	}
	
	public String calcula() {
		switch (this.cargo) {
		case 0:
			this.bonus = this.salario * 15 / 100;
			break;
		case 1:
			this.bonus = this.salario * 10 / 100;
			break;
		case 2:
			this.bonus = this.salario * 10 / 100;
			break;
		}
		
		return "dadosBonus";
	}
	
	//monta a URL com os parametros que sera enviados  
	public String dadosBonus() {
		return "dadosBonus?c=" + this.cargo + "&n=" + this.nome + "&s=" + this.salario + "&faces-redirect=true";
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}

	public Integer getCargo() {
		return cargo;
	}

	public void setCargo(Integer cargo) {
		this.cargo = cargo;
	}
	
	
}
