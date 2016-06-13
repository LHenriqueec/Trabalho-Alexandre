package br.com.projecao.evento.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Evento {
	
	private String descricao;
	private LocalDate dataInclusao;
	private LocalDate dataEvento;
	private StringBuffer sinopse;
	private ArrayList componentes;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(LocalDate dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	public LocalDate getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(LocalDate dataEvento) {
		this.dataEvento = dataEvento;
	}

	public StringBuffer getSinopse() {
		return sinopse;
	}

	public void setSinopse(StringBuffer sinopse) {
		this.sinopse = sinopse;
	}

	public ArrayList getComponentes() {
		return componentes;
	}

	public void setComponentes(ArrayList componentes) {
		this.componentes = componentes;
	}

	public void abrirEvento() {

	}

	public List<Evento> pesquisarEvento() {
		return null;
	}

}
