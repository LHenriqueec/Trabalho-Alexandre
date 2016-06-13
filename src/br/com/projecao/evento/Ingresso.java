package br.com.projecao.evento;

public class Ingresso {
	
	private String setor;
	private int cadeiraNumerada;
	private String situacao;
	
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
	
	public Ingresso(){
		
		setCadeiraNumerada(cadeiraNumerada);
		setSetor(setor);
		setSituacao(situacao);
		
	}

}
