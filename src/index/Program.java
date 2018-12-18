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

		List<Integer> id = new ArrayList<>();
		VectList[] inf = new VectList[4];
		boolean mais;
		int i = 0;

		do {
			id.add(i);

			System.out.println("Nome:");
			String nome = sc.nextLine();
			System.out.println("Contato:");
			int cont = sc.nextInt();
			sc.nextLine();
			System.out.println("E-mail:");
			String email = sc.nextLine();
			inf[i] = new VectList(id, nome, cont, email);
			System.out.println("ID: " + i + inf[i].toString());

			System.out.println("Deseja cadastrar mais usuarios (true/false)");
			mais = sc.nextBoolean();
			sc.nextLine();
			i++;
			System.out.println();
		} while (mais == true);

		boolean opcao;
		System.out.println("Possuem " + id.size() + " cadastros");
		System.out.println();

		do {
			System.out.println("Informe o id que deseja procurar");
			int procura = sc.nextInt();

			if (id.indexOf(procura) != -1) {
				System.out.println("ID: " + id.indexOf(procura));
				System.out.println("Nome: " + inf[id.indexOf(procura)].getNome());
				System.out.println("Contato: " + inf[id.indexOf(procura)].getContato());
				System.out.println("E-mail: " + inf[id.indexOf(procura)].getEmail());
				System.out.println();
			} else {
				System.out.println("ID invalido");
				System.out.println();
			}

			System.out.println("Deseja pesquisar outro ID (true/false)");
			opcao = sc.nextBoolean();
			System.out.println();
		} while (opcao == true);

		System.out.println("Programa finalizado!");
		sc.close();
	}

}