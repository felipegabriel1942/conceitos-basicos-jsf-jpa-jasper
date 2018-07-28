package com.br.controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.br.modelo.Pagamento;
@ManagedBean(name="controlePagamento")
@SessionScoped
public class ControlePagamento implements Serializable{

	private static final long serialVersionUID = 3963004819761142676L;
	
	private Pagamento pagamento;
	private List<Pagamento> lista = new ArrayList<Pagamento>();
	
	public ControlePagamento() {
		this.pagamento = new Pagamento();
	}
	
	public String adicionarPagamento() {
		this.lista.add(pagamento);
		this.pagamento = new Pagamento();
		return "formPagamento";
	}
	
	
	public Pagamento getPagamento() {
		return pagamento;
	}
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	public List<Pagamento> getLista() {
		return lista;
	}
	public void setLista(List<Pagamento> lista) {
		this.lista = lista;
	}
	
	

}
