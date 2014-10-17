package com.java.basic.classes;

/**
 * 
 * @author kumarveerappan
 *
 */
public class AutoShop {

	public static void main(String[] args) {
		
		Car car = new Car("Honda",2012,"seden",3000);
		Car car1 = new Car("Acura",2012,"seden",2999);
		
		System.out.println("Make of the Car is "+car.getCarName());
		
		System.out.println("Make of the Car is "+car1.getCarPrice());

	}

}
