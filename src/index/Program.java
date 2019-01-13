package index;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import mainList.VectList;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		VectList informacao;
		List<VectList> lista = new ArrayList<>();
		byte opcao;
		
		do {
			System.out.println(lista.size() + " Cadastros");
			byte opcao2;
			System.out.println("Escolha a opcao desejavel:");
			System.out.println("1 - Cadastrar usuarios\n2 - Procurar usuario por ID\n3 - Mostra todos cadastros");
			System.out.println("0 - Finalizar programa");
			opcao = sc.nextByte();
			
			if (opcao == 1) {
				do {
					System.out.println("Nome: ");
					sc.nextLine();
					String nome = sc.nextLine();
					System.out.println("E-mail: ");
					String email = sc.nextLine();
					System.out.println("Contato: ");
					String contato = sc.nextLine();
					informacao = new VectList(nome, contato, email);
					lista.add(informacao);
					
					System.out.println();
					System.out.println("ID: " + lista.size() + "\nNome: " + informacao.getNome() + "\nE-mail: " + informacao.getEmail() + "\nContato: " + informacao.getContato());
					System.out.println();
					
					System.out.println("Deseja informar outra cadastro a lista");
					System.out.println("0 - Nao");
					System.out.println("1 - Sim");
					opcao2 = sc.nextByte();

					System.out.println();
				}while (opcao2 == 1);
			}
			
			else if (opcao == 2) {	
				do {
					System.out.println("Digite o ID: ");
					int id = sc.nextInt();
					
					if (id != -1)
						System.out.println("\nNome: " + lista.get(id).getNome() + "\nE-mail: " + lista.get(id).getEmail() + "\nContato: " + lista.get(id).getContato() + "%n");
					else
						System.out.println("ID invalido");
					
					System.out.println("Deseja pesquisar outro ID:");
					System.out.println("0 - Nao");
					System.out.println("1 - Sim");
					opcao2 = sc.nextByte();
					System.out.println();
					
				}while (opcao2 == 1);
			}
			
			
			else if (opcao == 3) {
				System.out.println();
				for (int i = 0; i < lista.size(); i++) {
					System.out.println("\nNome: " + lista.get(i).getNome() + "\nE-mail: " + lista.get(i).getEmail() + "\nContato: " + lista.get(i).getContato());
					System.out.println();
				}
			}
			System.out.println();
			
		}while (opcao>0 && opcao<4);
		System.out.println();
		System.out.println("Programa finalizado!");
		
		sc.close();
	}
}