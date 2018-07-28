package com.br.controle;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.br.modelo.Usuario;

@ManagedBean(name="controleUsuario")
@RequestScoped
public class ControleUsuario implements Serializable{

	private static final long serialVersionUID = -2272457595626199019L;
	private Usuario usuario;
	
	public ControleUsuario() {
		usuario = new Usuario();
	}
	
	public String recebeDados() {
		FacesMessage msg = new FacesMessage("Dados recebidos com sucesso");
		FacesContext.getCurrentInstance().addMessage(null, msg);
		return "formUsuario";
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
