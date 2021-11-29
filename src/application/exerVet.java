package application;

import java.util.Scanner;
import java.util.Locale;
import entities.funcVet;



public class exerVet {
		public static void main (String[]args) { 
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);

			System.out.println("Quantos quartos serão alugados?: ");
			int q = sc.nextInt();

			funcVet[] vetor = new funcVet[10];

			for (int i = 1; i <= q; i++) {
				System.out.println();
				System.out.println("Aluguel #" + i + ":");
				System.out.println("Nome: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.println("Informe o email: ");
				String email = sc.nextLine();
				System.out.println("Informe o quarto: ");
				int quarto = sc.nextInt();

				vetor[quarto] = new funcVet(nome, email, quarto);

			}

			System.out.println("Quartos ocupados: ");
			for (int i = 0; i < vetor.length; i++) {

				if (vetor[i] != null) {
					System.out.println(vetor[i].getQuarto() + ": " + vetor[i].toString());

				}

			}

			sc.close();
		}

}
				
				
		
		
			                                                                                                                                                                              
