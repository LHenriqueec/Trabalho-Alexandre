package br.com.projecao.evento.application;

import br.com.projecao.evento.model.Evento;
import br.com.projecao.evento.model.Teatro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	private static List<Evento> list = new ArrayList<>();

	public static void main(String[] args) {

		start();
	}

	private static void cadastrarEvento() {
		Scanner scanner = new Scanner(System.in);
		Evento evento = new Evento();

		System.out.println("Descrição do Evento: "); evento.setDescricao(scanner.next());
		System.out.println("Sinopse: "); evento.setSinopse(new StringBuffer(scanner.next()));
		System.out.println("Data do Evento: "); evento.setDataEvento(LocalDate.parse(scanner.next()));
		evento.setDataInclusao(LocalDate.now());

		list.add(evento);
		System.out.println("Evento cadastrado!");
	}

	private static void listarEventos() {
		if (list.size() <= 0) {
			System.out.println("Não existem eventos!");
		} else {
			list.forEach(System.out::println);
		}
	}

	private static void start() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("MENU PRINCIPAL");
		System.out.println("1 - Visualizar Eventos");
		System.out.println("2 - Cadastrar Eventos");


		switch (scanner.nextInt()) {
			case 1: listarEventos();
				break;
			case 2: cadastrarEvento();
				break;
		}
		start();
	}

}
