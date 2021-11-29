package entities;

public class Account1 {
	
	private int num;
	private String nome;
	private double val;
	
	public Account1 () {
		
	}
	
	public Account1 (int num, String nome, double val) {
		
		this.num = num;
		this.nome = nome;
		this.val = val;
		
	}
	
	public Account1 (int num, String nome) {
		
		this.num = num;
		this.nome = nome;
		
	}
	
	public double getNum () {
		
		return num;
	}
	
	public String getNome () {
		
		return nome;
		
	}
	
	public void setNome (String nome) {
		
		this.nome = nome;
		
	}
	
	public double getVal () {
		
		return val;
		
	}
	
	public void deposit (double val) {
		
		this.val += val;
	}
	
	public void withdraw (double val) {
		
		this.val -= val + 5.0;

	}
	
	public String toString() {
		return "Conta: " + num + ", Titular: " + nome + ", Saldo: $" + String.format("%.2f", val);
	}
	
	
}