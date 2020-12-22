package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Room[] myRooms = new Room[10];
		
		/*System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			
			String gest = sc.nextLine();
			String email = sc.nextLine();
			int number = sc.nextInt();
			
			myRooms[i] = new Room(gest, email, number);			
		}
		
		for(int i = 0; i < myRooms.length; i++) {
			if(myRooms[i] != null) {
				System.out.println("Name: " 
			                        + myRooms[i].getGest() + "\n"
				                    + "Email: " 
			                        + myRooms[i].getEmail() + "\n"
				                    + "Room: " 
			                        + myRooms[i].getNumber() + "\n");				
			}
		}*/
		
		
		/*String[] vect = new String[] {"Lohana", "Aline", "Deise", "Flávia"};
		//For each
		for(String obj : vect) {
			System.out.println(obj);
		}*/
		
		List<String> myList = new ArrayList<String>();
		
		myList.add("Lohana");
		myList.add("Deise");
		myList.add("Flávia");
		myList.add("Aline");
		myList.add(2, "Italo"); 
		
		System.out.println(myList.size());
		
		myList.remove("Aline");
		
		myList.removeIf(s -> s.charAt(0) == 'I');
		
	    System.out.println("Index of Deise: " + myList.indexOf("Deise"));
	    System.out.println("Index of Italo: " + myList.indexOf("Italo"));
		
		
		//For each
		for(String s : myList) {
			System.out.println(s);
		}
		
		
		sc.close();
	}

}
