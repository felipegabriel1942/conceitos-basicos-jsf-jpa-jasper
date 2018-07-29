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
	
	
	private List<PessoaOld> lista;
	
	//Inicia a classe com a lista inicializada
	public ControleTabela() {
		lista = new ArrayList<PessoaOld>();
		lista.add(new PessoaOld(1,"Joao","(99)9999-99990"));
		lista.add(new PessoaOld(2,"Maria","(99)9999-99990"));
		lista.add(new PessoaOld(3,"Carlos","(99)9999-99990"));
		lista.add(new PessoaOld(4,"Maris","(99)9999-99990"));
		lista.add(new PessoaOld(5,"Felipe","(99)9999-99990"));
		lista.add(new PessoaOld(6,"José","(99)9999-99990"));
		lista.add(new PessoaOld(7,"Rafael","(99)9999-99990"));
		lista.add(new PessoaOld(8,"Marcos","(99)9999-99990"));
		lista.add(new PessoaOld(9,"Eduardo","(99)9999-99990"));
		lista.add(new PessoaOld(10,"Madalena","(99)9999-99990"));
	}
	
	public List<PessoaOld> getLista() {
		return lista;
	}


	public void setLista(List<PessoaOld> lista) {
		this.lista = lista;
	}
	
	
	

}
