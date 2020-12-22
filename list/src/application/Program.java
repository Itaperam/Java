package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 		
		
		System.out.println("Quantos funcionarios deseja inserir? ");
		int n = sc.nextInt();
		
		List<Funcionario> func = new ArrayList<Funcionario>();
		
		for(int i = 0; i < n; i++) {
			
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			double salary = sc.nextDouble();
			
			Funcionario aux = new Funcionario(id, name, salary);
			
			func.add(aux);
		}		
		
		for(Funcionario f : func) {
			System.out.println(f.getId());
			System.out.println(f.getName());
			System.out.println(f.getSalary());
			System.out.println("-----------");			
		}		

		sc.close();
	}

}
