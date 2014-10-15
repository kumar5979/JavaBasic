/**
 * 
 */
package com.java.basic;

/**
 * @author kumarveerappan
 *
 */
public class NumberDisplay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int increment10 = 10;
		for (int count = 0; count < 50; count++) {
			if (count == increment10) {
				System.out.print(" " + count+"\n");
				//System.out.println();
				increment10 = increment10 + 10;
			} else {
				System.out.print(" "+ count);

			}

		}
		System.out.println("\n End of program");

	}

}
