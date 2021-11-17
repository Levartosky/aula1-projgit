package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Account1;

public class Program1 {
	
	public static void main (String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account1 account;
		
		System.out.println("Informar numero da conta: ");
		int num = sc.nextInt();
		System.out.println("Informar nome do titular: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("Você deseja realizar um deposito inicial? (S para SIM, N para NÃO)");
		char op = sc.next().charAt(0);
		
		if (op == 's') {
			
			System.out.println("Informar um valor para deposito inicial: ");
			double depositoInicial = sc.nextDouble();
			account = new Account1 (num, nome, depositoInicial);
		}
		
		else {
			
			account = new Account1 (num, nome);
		}
		
		System.out.println("Dados da conta: ");
		System.out.println(account.toString());
		
		System.out.println("Insira um valor para deposito: ");
		double valorDeposito = sc.nextDouble();
		account.deposit(valorDeposito);
		
		System.out.println("Dados da conta atualizados: ");
		System.out.println(account.toString());
		
		System.out.println("Insira um valor para saque: ");
		double valorSaque = sc.nextDouble();
		account.withdraw(valorSaque);
		
		System.out.println("Dados da conta atualizados: ");
		System.out.println(account.toString());
		
		sc.close();
	}
	
}