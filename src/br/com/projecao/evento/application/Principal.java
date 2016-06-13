package br.com.projecao.evento.application;

import br.com.projecao.evento.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	private static List<Evento> list = new ArrayList<>();
	private static List<Usuario> listUsuario = new ArrayList<>();

	public static void main(String[] args) {

		start();
	}


	private static void start() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("MENU PRINCIPAL");
		System.out.println("1 - Visualizar Eventos");
		System.out.println("2 - Cadastrar Eventos");
		System.out.println("3 - Cadastrar Usuario");

		switch (scanner.nextInt()) {
			case 1: listarEventos();
				break;
			case 2: criarEvento();
				break;
			case 3: cadastrarUsuario();
				break;
		}

		start();
	}

	private static void cadastrarUsuario() {
		Usuario usuario = new Usuario();
		usuario.cadastrarUsuario();
		listUsuario.add(usuario);
	}

	private static void criarEvento() {
		Evento evento = new Evento();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Descrição: "); evento.setDescricao(scanner.next());
		System.out.println("Sinopse: "); evento.setSinopse(new StringBuffer(scanner.next()));
		evento.setDataInclusao(LocalDate.now());
		System.out.println("Data do Evento: "); evento.setDataEvento(LocalDate.parse(scanner.next()));

		System.out.println("TIPO DE AMBIENTE: ");
		System.out.println("1 - TEATRO");
		System.out.println("2 - GINASIO");
		System.out.println("3 - AUDITORIO");

		switch (scanner.nextInt()) {
			case 1: evento.setAmbiente(new Teatro());
				break;
			case 2: evento.setAmbiente(new Ginasio());
				break;
			case 3: evento.setAmbiente(new Auditorio());
				break;
		}
		evento.getAmbiente().adicionarAmbiente();

		list.add(evento);

	}

	private static void listarEventos() {
		if (list.size() <= 0) {
			clearConsole();
			System.out.print("Não existem eventos!\n");
			return;
		}

		list.forEach(evento -> {
			int i = 1;
			System.out.println(i +"-"+ evento);
			i++;
		});
		Scanner scanner = new Scanner(System.in);
		System.out.println("Deseja visualizar algum evento: 1-Sim 2-Não");

		switch (scanner.nextInt()) {
			case 1: detalharEvento();
				break;
			case 2: break;
		}
	}

	private static void detalharEvento() {
		System.out.println("Nº evento: ");
		Scanner scanner = new Scanner(System.in);

		list.get(scanner.nextInt()-1).abrirEvento();
	}

	private static void clearConsole() {
		//Gambiarra
		for (int i = 0; i < 30; i++) {
			System.out.println();
		}
	}
}
