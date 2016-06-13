package br.com.projecao.evento.model;

import java.sql.Date; 

public class Usuario {
	
	private String nome;
	private String CPF;
	private String endereco;
	private String email;
	private String telefone;
	private Date datanascimento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Date getDatanascimento() {
		return datanascimento;
	}
	public void setDatanascimento(Date datanascimento) {
		this.datanascimento = datanascimento;
	}
	
	public Usuario(){
		
		setCPF(CPF);
		setDatanascimento(datanascimento);
		setEmail(email);
		setEndereco(endereco);
		setNome(nome);
		setTelefone(telefone);
	
	}

		public void CadastrarUsuario(){			
			
					
		}
		
		public void ComprarIngresso(){
			
			Compra compra = new Compra(null, null, 0);			

			
		}
			
	}
