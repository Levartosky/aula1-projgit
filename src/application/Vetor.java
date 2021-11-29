package application;
import java.util.Locale;
import java.util.Scanner;

public class Vetor {

	public static void main (String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Informe a quantidade de pessoas: ");
		int n = sc.nextInt();

		double [] vetor = new double [n];
		
		for (int i=0; i<n; i++) {
			
			System.out.println("Informe sua altura: ");
			double a = sc.nextDouble();
			vetor [i] = a;
			
		}
		
		double soma = 0.0;
		
		for (int i=0; i<n; i++) {
		soma += vetor[i];
		 
		}
		
		double avg = soma/n;
		
		
		
		System.out.printf("A média das alturas é: %.2f%n", avg);
		
		sc.close();
	}
}
