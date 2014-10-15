
package com.java.basic;

/**
 * This is my first Java Program.
 * @author kumarveerappan
 *
 */

/**
 * 
 * @author kumarveerappan
 *
 */
//Class class
//Single Line Comments

public class FirstProgram {

	/**
	 * @param args
	 * Starting main method.
	 */
	public static void main(String[] args) {

		int number = -12 , numberb =-12;
		float amount=1230.40f;
		double dollorAmount=22;
		
		byte byteChar = 127;
		short shortNum = 9;
		char charA = 'R';
		long longNumber =12342354;
		
		String text = "My First Program";
		
		System.out.print("My First Program 67");
		System.out.println("\n"+text);
		System.out.println("Number "+number);
		System.out.println("numberb "+numberb);
		System.out.println("integer: "+number);
		System.out.println("float: "+amount);
		System.out.println("Double: "+dollorAmount);
		
		if(number==-12){
			//true block
			System.out.print("It\"s equals \r");
		}else{
			//flase block
			System.out.print("not equals");
		}
		
		for(int i=0;i<10;i++){
			System.out.println(i);
		}
		System.out.println("i");

	}
	
	

}
