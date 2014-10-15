package com.java.basic.classes;

public class AutoShop {

	public static void main(String[] args) {
		Car car = new Car();
		car = null;
		Car copyCar = car;
		copyCar.make = "Honda";
		copyCar.model = 2009;
		copyCar.type = "seden";
		copyCar.price = 7234.00;
		copyCar.countryName = "India";
		
		System.out.println("Make : "+car.make);
		System.out.println("Model : "+car.model);
		System.out.println("Type : "+car.type);
		System.out.println("Price : "+car.price);
		
		Car myCar = new Car("Ferreri",2014,"Coupe",300000);
		Car ourCar = new Car("Mustang",2014,"Coupe",68000);
		Car car1 = new Car("Acura",0,"",0);

	}

}
