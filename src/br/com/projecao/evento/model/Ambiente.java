package br.com.projecao.evento.model;

import java.util.Scanner;

public abstract class Ambiente {

	private String descricao;
	private int capacidadeTotal;
	private Endereco endereco;
	private String nome;


	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCapacidadeTotal() {
		return capacidadeTotal;
	}

	public void setCapacidadeTotal(int capacidadeTotal) {
		this.capacidadeTotal = capacidadeTotal;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void adicionarAmbiente() {
		Scanner scanner = new Scanner(System.in);
		setNome(this.getClass().getSimpleName());

		System.out.println("Descrição: ");
		setDescricao(scanner.next());

		System.out.println("Capacidade: ");
		setCapacidadeTotal(scanner.nextInt());

		System.out.println("ENDEREÇO\n");
		setEndereco(new Endereco());

		System.out.println("Quadra: ");
		getEndereco().setQuadra(scanner.next());

		System.out.println("Nº Casa: ");
		getEndereco().setNumCasa(scanner.nextInt());

		System.out.println("Bairro: ");
		getEndereco().setBairro(scanner.next());

		System.out.println("Cidade: ");
		getEndereco().setCidade(scanner.next());

		System.out.println("CEP: ");
		getEndereco().setCep(scanner.next());

	}

	@Override
	public String toString() {
		StringBuffer buff = new StringBuffer();
		buff.append("Tipo: ").append(nome).append("\n")
				.append("Descrição: ").append(descricao).append("\n")
				.append("Capacidade: ").append(capacidadeTotal).append("\n")
				.append("Endereço: ").append(endereco).append("\n");

		return buff.toString();
	}
}
