package com.br.controle;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "controlePrincipal")
@SessionScoped

//Deve ser implementada a classe Serializable sempre que se trabalhando com managed bean
public class ControlePrincipal implements Serializable {
	
	
	//E deve ser declarado seu metodo default	
	private static final long serialVersionUID = 2454789847241837610L;
	
	private String mensagem;
	
	//Ao instanciar a classe o atributo mensagem recebe o parametro passado no contrutor
	public ControlePrincipal() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:S");
		this.mensagem ="Este bean foi criado no momento " + sdf.format(Calendar.getInstance().getTime());
	}
	
	//Metodo utilizado para redirecionamento dinamico de página
	public String sobre() {
		this.mensagem = "Você navegou dinâmicamente";
		return "sobre";
	}
	
	//Redireciona fisicamente a pagina, porem consome mais dados
	public String sobreRedirecionado() {
		this.mensagem = "Você foi redirecionado para a página sobre.xhtml";
		return "sobre?faces-redirect=true";
	}
	
	//Os metodos getters e setters são extramente necessarios na comunicação entre o managedBean e a página jsf/xhtml
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
	
}
