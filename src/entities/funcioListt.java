package entities;

public class funcioListt {
	
	private int id;
	private String name;
	private double sal;
	
	public funcioListt () {
		
		
	}
	public funcioListt (int id, String name, double sal) {
		
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	public Integer getId () {
		
		return id;
		
	}
	
	public void setId (int id) {
		
		this.id = id;
	}
	
	public String getName () {
		
		return name;
		
	}
	
	public void setName (String name) {
		
		this.name = name;
		
	}
	
	public Double getSal () {
		
		return sal;
		
	}
	
	public void setSal (double sal) {
		
		this.sal = sal;
		
	}
	
	public void incSal (double perc) {
		
		this.sal += sal * perc/100.0;
		
	}
	
	public String toString () {
		
		return 	id +", "+
				name +", "+
				String.format("%.2f", sal);
		
	}

}
