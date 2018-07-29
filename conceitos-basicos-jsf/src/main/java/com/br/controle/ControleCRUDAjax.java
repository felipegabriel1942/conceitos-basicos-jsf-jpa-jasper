package com.br.controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.br.modelo.Pessoa;

@ManagedBean(name="controleCRUDAjax")
@ViewScoped
public class ControleCRUDAjax implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<Pessoa> lista = new ArrayList<>();
	private Pessoa objeto;
	private Boolean editando;
		
	
	public ControleCRUDAjax() {
		editando = false;
	}
	
	public String listar() {
		return "crudAjax?faces-redirect=true";
	}
	
	public void novo() {
		objeto = new Pessoa();
		editando = true;
	}
	
	public void salvar() {
		if(objeto.getId() == null) {
			objeto.setId(lista.size() + 1);
			lista.add(objeto);
		}
		
		editando = false;
	}
	
	public void cancelar() {
		editando = false;
	}
	
	public void alterar(Pessoa obj) {
		objeto = obj;
		editando = true;
	}
	
	public void excluir(Pessoa obj) {
		lista.remove(obj);
		editando = false;
	}
	
	
	public List<Pessoa> getLista() {
		return lista;
	}
	public void setLista(List<Pessoa> lista) {
		this.lista = lista;
	}
	public Pessoa getObjeto() {
		return objeto;
	}
	public void setObjeto(Pessoa objeto) {
		this.objeto = objeto;
	}
	public Boolean getEditando() {
		return editando;
	}
	public void setEditando(Boolean editando) {
		this.editando = editando;
	}
	
	
	
	

}
