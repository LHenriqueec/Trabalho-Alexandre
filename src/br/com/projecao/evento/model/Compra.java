package br.com.projecao.evento.model;

public class Compra {

	private Double valorUnit;
	private Double valortotal;
	private int quantidade;
	private Ingresso ingresso;

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

	public Ingresso getIngresso() {
		return ingresso;
	}

	public void setIngresso(Ingresso ingresso) {
		this.ingresso = ingresso;
	}

	@Override
	public String toString() {
		StringBuffer buff = new StringBuffer();
		buff.append("	Valor unitário: ").append(valorUnit)
				.append("	Quantidade: ").append(quantidade)
				.append("	Valor total: ").append(valortotal).append("\n\n");


		return buff.toString();
	}
}
