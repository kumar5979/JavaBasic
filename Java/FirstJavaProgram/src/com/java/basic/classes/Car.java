package com.java.basic.classes;

public class Car extends Country{
	
	String make;
	
	int model;
	
	String type;
	
	double price;
	
	Car(){
	}
	
	Car(String make){
		this.make= make;
	}
	
	Car(String make,int model){
		this(make);
		this.model=model;
		
	}
	
	Car(String make,int model,String type){
		this(make,model);
		this.type=type;
		
	}
	
	Car(String make,int model,String type,double price){
	    this(make,model,type);
		this.price = price;
		
	}

}
