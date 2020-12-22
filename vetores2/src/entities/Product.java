package entities;

public class Product {
	
	private String name;
	private double price;
	
	
	//Constructor
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	//Getrs and Seters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	

}
