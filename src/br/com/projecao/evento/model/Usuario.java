package br.com.projecao.evento.model;

import javafx.scene.control.ComboBox;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

public class Usuario {

	private String nome;
	private String cpf;
	private Endereco endereco;
	private String email;
	private String telefone;
	private LocalDate dataNascimento;

	public Usuario() {
		endereco = new Endereco();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
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

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void cadastrarUsuario() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("CADASTRO DE USUARIO");
		System.out.print("Nome: "); setNome(scanner.next());
		System.out.print("CPF: "); setCpf(scanner.next());
		System.out.print("Telefone: "); setTelefone(scanner.next());
		System.out.print("Data de Nascimento: "); setDataNascimento(LocalDate.parse(scanner.next()));
		System.out.print("Bairro: "); this.endereco.setBairro(scanner.next());
		System.out.print("Quadra: "); this.endereco.setQuadra(scanner.next());
		System.out.print("Nº casa: "); this.endereco.setNumCasa(scanner.nextInt());
		System.out.print("Cidade: "); this.endereco.setCidade(scanner.next());
		System.out.print("CEP: "); this.endereco.setCep(scanner.next());

		System.out.println(this);
	}

	public void comprarIngresso(Compra compra) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("INFORMAÇÕES DA COMPRA");
		System.out.print("Valor Unitário: "); compra.setValorUnit(scanner.nextDouble());
		System.out.print("Quantidade: "); compra.setQuantidade(scanner.nextInt());
		System.out.print("Valor da Compra: "); compra.setValortotal(compra.calculaValor());
	}


	@Override
	public String toString() {
		StringBuffer buff = new StringBuffer();
		buff.append("USUARIO").append("\n")
				.append("Nome: ").append(nome).append("\n")
				.append("CPF: ").append(cpf).append("\n")
				.append("Endereço: ").append(endereco).append("\n")
				.append("Email: ").append(email).append("\n")
				.append("Telefone: ").append(telefone).append("\n")
				.append(endereco);

		return buff.toString();	}
}
