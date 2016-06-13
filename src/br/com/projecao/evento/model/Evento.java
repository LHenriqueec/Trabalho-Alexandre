package br.com.projecao.evento.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Evento {
	
	private String descricao;
	private LocalDate dataInclusao;
	private LocalDate dataEvento;
	private StringBuffer sinopse;
	private ArrayList componentes;
	private Ambiente ambiente;

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

	public Ambiente getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(Ambiente ambiente) {
		this.ambiente = ambiente;
	}

	public void abrirEvento() {
		System.out.println(ambiente);
	}

	public void pesquisarEvento(String pesquisa) {

	}

	@Override
	public String toString() {
		StringBuffer buff = new StringBuffer();
		buff.append("Descrição: ").append(descricao)
				.append(" Sinopse:").append(sinopse)
				.append(" Data do Evento (yyyy-MM-dd): ").append(dataEvento);

		return buff.toString();
	}
}
