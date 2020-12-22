package entities;

public class Room {
	
	private String gest;
	private String email;
	private int number;	
	
	//Constructor
	public Room(String gest, String email, int number) {
		
		this.gest = gest;
		this.email = email;
		this.number = number;
	}
	
	//Geters and Setters
	public String getGest() {
		return gest;
	}
	public void setGest(String gest) {
		this.gest = gest;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
	

}
