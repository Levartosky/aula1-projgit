// Neste exercicio, utilizei busca em lambda, porém, existe outra forma de executar a busca do funcionário na lista abaixo;

package application;

import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;
import entities.funcioListt;
import java.util.stream.Collectors;



public class funcioList {
	
	public static void main (String[]args){
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		List<funcioListt> list = new ArrayList<>();	
		
		for (int i=0;i<n;i++) {
		
			
		System.out.println("Employee #"+(i+1)+":");
		System.out.println("Enter your ID: ");
		Integer id = sc.nextInt();
		while (hasId (list, id)) {
			
			System.out.println("This ID already taken! Try again: ");
			id = sc.nextInt();
		}
		
		
		System.out.println("Enter your name: ");
		sc.nextLine();
		String name = sc.nextLine();		
		System.out.println("Enter your salary: ");
		Double sal = sc.nextDouble();
	
		funcioListt emp = new funcioListt (id, name, sal);
		
		list.add(emp);
		
		}
		
		System.out.println("Enter the employee ID that will have salary increase: ");
		int idInc = sc.nextInt();
		//Forma lambda de busca do funcionario, usa funcao "lambda": funcioListt emp = list.stream().filter(x -> x.getId() == idInc).findFirst().orElse(null);
		//Forma normal de busca do funcionário, usa função auxiliar "position": Integer pos = position (list, idInc);
		funcioListt emp = list.stream().filter(x -> x.getId() == idInc).findFirst().orElse(null);
		if (emp == null) {
			
			System.out.println("This id doesn't exist.");
			
		}
		
		else {
			
			System.out.println("Enter the percentage: ");
			double perc = sc.nextInt();
			//forma lambda: emp.incSal(perc);
			//forma manual: list.get(pos).incSal(perc);			
			emp.incSal(perc);
			
						
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for (funcioListt e : list) {
			
			System.out.println(e);
			
		}	
		
		
		
		 

		
		System.out.println();
		
		
		
		sc.close();
		
	}

	public static Integer position (List<funcioListt> list, int id) {
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).getId() == id) {
				
				return i;
			}
			
		}
		return null;
	}
	
	public static boolean hasId (List<funcioListt> list, int id) {
		
		funcioListt emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
		
	}
	
}
