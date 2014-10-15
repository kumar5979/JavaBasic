package com.java.basic;

class ArthimetricLogic {
	public static void main(String args[]) {
		Addition add;
		Addition addition = new Addition(10,20);
		addition.addNumbers();
		int total = addition.addNumbers();
		System.out.println("Total :"+total);
		
		Addition squareRoot = new Addition(7);
		int returnValue = squareRoot.squareRoot();
		System.out.println("SquareRoot od 7 is "+returnValue);
		
		add = new Addition();
	    add.number1 = 8;
	    
		
	}
	
	
}