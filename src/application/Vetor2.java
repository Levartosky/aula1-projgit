package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Vetor2 {

	public static void main (String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		System.out.println("Informe a quantidade de produtos: ");
		int n = sc.nextInt();
		
		
		Produto [] vetor = new Produto[n];
		
		for (int i=0; i<n; i++) {			
			
			System.out.println("Informe o nome do produto: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.println("Informe o valor do produto: ");
			double valor = sc.nextDouble();
			
			vetor [i] = new Produto(nome, valor);		
			
		}
		
		double soma = 0.0;
		for (int i=0; i<n; i++) {
			
			soma += vetor[i].getValor();
			
			
		}
		
		double media = soma / n;
		
		System.out.printf("A media do valor dos produtos é: %.2f%n", media);
		
		sc.close();
	}
	
}
