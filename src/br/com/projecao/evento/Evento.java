package br.com.projecao.evento;

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
	public void setDescricao(String descicao) {
		this.descricao = descricao;
	}
	public Date getDataInclusao() {
		return DataInclusao;
	}
	public void setDataInclusao(Date dataInclusao) {
		this.DataInclusao = dataInclusao;
	}
	public Date getDataEvento() {
		return DataEvento;
	}
	public void setDataEvento(Date dataEvento) {
		this.DataEvento = dataEvento;
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
		this.Componentes = componentes;
	}
	
	
	public Evento(String descricao,Date dataInclusao,Date dataEvento, StringBuffer Sinopse, ArrayList componentes){
		
		setDescricao(descricao);
		setDataInclusao(dataInclusao);
		setDataEvento(DataEvento);
		setSinopse(Sinopse);
		setComponentes(Componentes);
		
	}
	
	public void AbrirEvento(){ 
		
		
		}
	
	public void pesquisarEvento(){
		
	}
	
}
