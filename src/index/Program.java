package index;

import java.util.Locale;
import java.util.Scanner;

import mainList.VectList;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe a quantidade: ");
		int n = sc.nextInt();
		VectList[] lista = new VectList[n];
		
		//Cadastro 
		for (int i = 0; i<lista.length; i++) {
			System.out.println("Nome:  ");
			if (i==0)
				sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Telefone/Contato:   ");
			int contato = sc.nextInt();
			sc.nextLine();
			System.out.println("E-mail:   ");
			String email = sc.nextLine();
			
			lista[i] = new VectList(i , name, contato, email);
			System.out.println();
			System.out.println("Informações: \n"+lista[i].toString());
			System.out.println();
		}
		
		System.out.println();
		
		char op;
		
		//Consulta de id
		do {
			System.out.print("Informe o ID do usuario que deseja pesquisar: ");
			int id = sc.nextInt();
			System.out.println();
			if (id < lista.length) {
				System.out.println(lista[id].toString());
			}
			else {
				System.out.println("ID não existe!");
			}
			System.out.println();

			System.out.println("Deseja procurar outro usuario? (y/n)");
			op = sc.next().charAt(0);
			System.out.println();
		}while (op == 'y');
		
		System.out.println("Programa finalizado!");
		sc.close();
	}

}
