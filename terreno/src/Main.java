import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double precoTerreno = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", precoTerreno);
		
		sc.close();*/
		
		//Exemplo bitwise - comparação bit a it
		
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b100000;
		
		int n = sc.nextInt();
		
		if((n & mask) != 0) {
			System.out.println("6th bit is true");			
		}
		else {
			System.out.println("6th bit is false");
		}		
		
		sc.close();
		
		
		

	}

}
