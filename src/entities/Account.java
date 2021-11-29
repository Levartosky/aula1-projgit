package entities;


public class Account {

	private int acc;
	private String hol;
	private double val;
	
	public Account () {
		
	}
	
	public Account(int acc, String hol) {
		this.acc = acc;
		this.hol = hol;
	}

	
	public Account (int acc, String hol, double initialDeposit) {
		this.acc = acc;
		this.hol = hol;
		deposit(initialDeposit);
	}

	public int getAcc() {
		return acc;
	}


	public String getHol() {
		return hol;
	}

	public void setHol(String hol) {
		this.hol = hol;
	}

	public double getVal() {
		return val;
	}

	public void deposit (double qnt) {		
		val += qnt;		
	}
	
	public void withdraw (double qnt) {		
		val -= qnt + 5.0;
	}
	
	public String toString() {
		
		return "Account "
				+ acc
				+ ", Holder: "	
				+ hol
				+ ", Balance: $ "
				+ String.format("%.2f", val);
	}
}
