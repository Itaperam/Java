package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.println("Informe o número:");
		int numero = sc.nextInt();		
		
		System.out.println("Informe o nome:");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.println("Deseja efetuar um depósito?  s/n");
		char resposta = sc.next().charAt(0);
		
		if(resposta == 's') {
			
			System.out.println("Informe o valor de depósito:");
			double saldo = sc.nextDouble();
		    conta = new Conta(numero, nome, saldo);
						
		}
		else {
			conta = new Conta(numero, nome);
		}		
		
		System.out.println("Dados da conta:");
		System.out.println(conta);
		
		System.out.println("Informe o valor de depósito:");
		double valor = sc.nextDouble();
		conta.deposita(valor);
		
		System.out.println("Dados da conta:");
		System.out.println(conta);
		
		System.out.println("Informe o valor do saque:");
		valor = sc.nextDouble();
		conta.saca(valor);
		
		System.out.println("Dados da conta:");
		System.out.println(conta);
		
		
		sc.close();
		

	}

}
