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
		List <String> nomes = new ArrayList<>();
		List <String> emails = new ArrayList<>();
		List <String> contatos = new ArrayList<>();
		VectList lista;
		byte opcao;
		int i = 0;
		
		do {
			System.out.println(nomes.size() + " Cadastros");
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
					
					lista = new VectList(nome, contato, email);
					nomes.add(nome);
					emails.add(email);
					contatos.add(contato);
					
					System.out.println();
					System.out.println("ID: " + i + "\nNome: " + lista.getNome() + "\nE-mail: " + lista.getEmail() + "\nContato: " + lista.getContato());
					System.out.println();
					
					System.out.println("Deseja informar outra cadastro a lista");
					System.out.println("0 - Nao");
					System.out.println("1 - Sim");
					opcao2 = sc.nextByte();
					
					i++;
					System.out.println();
				}while (opcao2 == 1);
			}
			
			else if (opcao == 2) {	
				do {
					System.out.println("Digite o ID: ");
					int id = sc.nextInt();
					
					if (id != -1)
						System.out.println("\nNome: " + nomes.get(id) + "\nE-mail: " + emails.get(id) + "\nContato: " + contatos.get(id) + "\n");
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
				for (int j = 0; j<nomes.size(); j++) {
					System.out.println("Nome: " + nomes.get(j) + "\nE-mail: " + emails.get(j) + "\nContato: " + contatos.get(j));
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