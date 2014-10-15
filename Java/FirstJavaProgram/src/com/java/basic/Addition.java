package com.java.basic;

public class Addition{
	
	int number1;
	
	int number2;
	
	Addition(){
		
	}
	
	Addition(int number1){
		this.number1 = number1;
	}
	
	Addition(int number1,int number2){
		this(number1);
		this.number2 = number2;
	}
	
	public int addNumbers(){
		System.out.println("Sum of Two numbers are : "+(number1+number2));
		return number1+number2;
	}
	
	public int squareRoot(){
		return number1*number1;
	}
    
}
