package com.br.controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "controleTabela")
@SessionScoped
public class ControleTabela implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	private List<Pessoa> lista;
	
	//Inicia a classe com a lista inicializada
	public ControleTabela() {
		lista = new ArrayList<Pessoa>();
		lista.add(new Pessoa(1,"Joao","(99)9999-99990"));
		lista.add(new Pessoa(2,"Maria","(99)9999-99990"));
		lista.add(new Pessoa(3,"Carlos","(99)9999-99990"));
		lista.add(new Pessoa(4,"Maris","(99)9999-99990"));
		lista.add(new Pessoa(5,"Felipe","(99)9999-99990"));
		lista.add(new Pessoa(6,"José","(99)9999-99990"));
		lista.add(new Pessoa(7,"Rafael","(99)9999-99990"));
		lista.add(new Pessoa(8,"Marcos","(99)9999-99990"));
		lista.add(new Pessoa(9,"Eduardo","(99)9999-99990"));
		lista.add(new Pessoa(10,"Madalena","(99)9999-99990"));
	}
	
	public List<Pessoa> getLista() {
		return lista;
	}


	public void setLista(List<Pessoa> lista) {
		this.lista = lista;
	}
	
	
	

}
