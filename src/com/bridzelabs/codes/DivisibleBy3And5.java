package com.bridzelabs.codes;

/**
 * 
 * @author pande
 *
 */

public class DivisibleBy3And5 {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/**
		 * number divisible by 3 and 5
		 */
			for(int i = 1; i <= 50; i++) {
			if(i % 3 == 0 && i % 5 == 0 ) {
				System.out.println("The number is divisible");
				
			}
			else {
				System.out.println("The given number is not divisible");
				
			}
		}
	}

}
