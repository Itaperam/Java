package apllication;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Principal {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PROCESSING);
		
		System.out.println(order);

	}

}
