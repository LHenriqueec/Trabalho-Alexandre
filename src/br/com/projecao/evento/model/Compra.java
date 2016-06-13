package br.com.projecao.evento.model;

public class Compra {
	
	private Double valorUnit;
	private Double valortotal;
	private int quantidade;

	public Double getValorUnit() {
		return valorUnit;
	}

	public void setValorUnit(Double valorUnit) {
		this.valorUnit = valorUnit;
	}

	public Double getValortotal() {
		return valortotal;
	}

	public void setValortotal(Double valortotal) {
		this.valortotal = valortotal;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double calculaValor() {
		return valorUnit * quantidade;
	}
}
