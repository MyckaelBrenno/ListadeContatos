package Array;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MainContatoP {

	public static void InicializarMenu() {
		System.out.println("");
		System.out.println("MENU AGENDA ->");
		System.out.println("1 - Add Contato");
		System.out.println("2 - Listar contatos");
		System.out.println("3 - Sair");
		System.out.print("");
	}

	public static void main(String[] args) {

		ContatoP[] agenda = new ContatoP[10];

		InicializarMenu();

		Scanner ler = new Scanner(System.in);
		int escolha = ler.nextInt();

		while (escolha != 3) {

			switch (escolha) {

			case 1:
				System.out.println();
				System.out.println("ADICIONAR CONTATO -> ");
				System.out.print("Nome do Contato: ");
				String nome = ler.next();
				System.out.print("Telefone ou Celular -> ");
				String telefone = ler.next();
				System.out.print("Email -> ");
				String email = ler.next();

				for (int i = 0; i < agenda.length; i++) {
					if (agenda[i] == null) {
						agenda[i] = new ContatoP(nome, email, telefone);
						System.out.println("Contato Salvo!");
						break;
					} else if(agenda[9] != null) {
						System.out.println("");
						System.out.println("Lista de contatos cheia!!");
						break;
					}
				}
				break;
			case 2:
				if (agenda[0] == null) {
					System.out.println("Não existe contatos!");
				} else {
					for (int i = 0; i < agenda.length; i++) {
						if (agenda[i] != null) {
							System.out.println("");
							System.out.println("Contato - " + i);
							agenda[i].Imprimir();
						}
					}
				}
				break;
			}
			InicializarMenu();
			escolha = ler.nextInt();
		}
		System.out.println("");
		System.out.println("Programa Encerrado!");
	}

}
