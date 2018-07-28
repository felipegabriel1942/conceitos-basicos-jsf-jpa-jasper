package com.br.controle;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import com.br.conversores.ConverterCidades;

@ManagedBean(name = "controleAulaConversores")
public class ControleAulaConversores implements Serializable {

	private static final long serialVersionUID = 5260873669871483620L;

	private Calendar nascimento;
	private Cidade cidade;
	private List<Cidade> listaCidades = new ArrayList<Cidade>();
	private ConverterCidades converterCidade;

	public ControleAulaConversores() {
		this.nascimento = Calendar.getInstance();
		listaCidades.add(new Cidade(1, "São Paulo", "SP"));
		listaCidades.add(new Cidade(2, "Fortaleza", "CE"));
		listaCidades.add(new Cidade(3, "Salvador", "BA"));
		converterCidade = new ConverterCidades(listaCidades);
	}

	public String lerDados() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		FacesMessage msg = new FacesMessage("Informe uma data valida");

		if (this.nascimento != null && cidade != null) {
			msg = new FacesMessage("Nascimento: " + sdf.format(this.nascimento.getTime()) + " | Cidade: "
					+ cidade.getNome() + " | UF: " + cidade.getUf());
		}
		
		FacesContext.getCurrentInstance().addMessage("", msg);
		nascimento = null;
		return "formConversores";
	}

	public Calendar getNascimento() {
		return nascimento;
	}

	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public List<Cidade> getListaCidades() {
		return listaCidades;
	}

	public void setListaCidades(List<Cidade> listaCidades) {
		this.listaCidades = listaCidades;
	}

	public ConverterCidades getConverterCidade() {
		return converterCidade;
	}

	public void setConverterCidade(ConverterCidades converterCidade) {
		this.converterCidade = converterCidade;
	}
	
	

}
