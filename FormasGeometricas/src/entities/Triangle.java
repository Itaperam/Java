package entities;

public class Triangle {
	
	public double a, b, c, p, area;
	
	
	public double calculaArea() {
		
		p = (a + b + c)/2.0;
		area = Math.sqrt(p*(p-a) * (p-b) * (p-c));		
		return area;		
	}

}
