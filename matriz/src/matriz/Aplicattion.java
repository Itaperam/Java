package matriz;

import java.util.Scanner;

public class Aplicattion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int z = sc.nextInt();
		
		int[][] matriz = new int[n][z];
		int c = 0;
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
				
					if(matriz[i][j] < 0) {
						c++;				
				}
			}
		}
		
		int cp = 0;
		
		int p = sc.nextInt();	
		
		
		System.out.print("Main diagonal: ");
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(i == j) {
					System.out.print(matriz[i][j] + " ");
				}
				if(matriz[i][j] == p) {
					cp++;
				}
			}			
		}
		System.out.println("Repetições " + p + ": " + cp);
		System.out.println("Negativos: " + c);
	}

}
