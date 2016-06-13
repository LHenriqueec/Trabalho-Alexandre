package br.com.projecao.evento.model;

import java.sql.Date;
import java.util.ArrayList;

public class Evento {
	
	private String descricao;
	private Date DataInclusao;
	private Date DataEvento;
	private StringBuffer Sinopse;
	private ArrayList Componentes;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataInclusao() {
		return DataInclusao;
	}

	public void setDataInclusao(Date dataInclusao) {
		DataInclusao = dataInclusao;
	}

	public Date getDataEvento() {
		return DataEvento;
	}

	public void setDataEvento(Date dataEvento) {
		DataEvento = dataEvento;
	}

	public StringBuffer getSinopse() {
		return Sinopse;
	}

	public void setSinopse(StringBuffer sinopse) {
		Sinopse = sinopse;
	}

	public ArrayList getComponentes() {
		return Componentes;
	}

	public void setComponentes(ArrayList componentes) {
		Componentes = componentes;
	}

	public void abrirEvento() {

	}

	public void pesquisarEvento() {

	}

}
