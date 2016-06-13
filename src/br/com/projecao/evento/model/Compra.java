package br.com.projecao.evento.model;

public class Compra {
	
	private Double ValorUnit;
	private Double Valortotal;
	private int Quantidade;
	
	public Double getValorUnit() {
		return ValorUnit;
	}
	public void setValorUnit(Double valorUnit) {
		ValorUnit = valorUnit;
	}
	public Double getValortotal() {
		return Valortotal;
	}
	public void setValortotal(Double valortotal) {
		Valortotal = valortotal;
	}
	public int getQuantidade() {
		return Quantidade;
	}
	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}
	
	public Compra(Double ValorUnit,Double Valortotal,int Quantidade){
		
		setQuantidade(Quantidade);
		setValorUnit(ValorUnit);
		setValortotal( CalculaValor() );
		
	}
	
	public Double CalculaValor(){
		
		return getValorUnit() * getQuantidade() ;
		
	}		
	
}
