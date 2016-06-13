package br.com.projecao.evento.model;

public class Ingresso {
	
	private String setor;
	private int cadeiraNumerada;
	private String situacao;
	private Evento evento;

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public int getCadeiraNumerada() {
		return cadeiraNumerada;
	}

	public void setCadeiraNumerada(int cadeiraNumerada) {
		this.cadeiraNumerada = cadeiraNumerada;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}
}
