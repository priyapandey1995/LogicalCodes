package com.bridzelabs.codes;

import java.util.Scanner;

public class Factorial {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/**
		 * factorial of given number
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int fact = 1;
		int num = sc.nextInt();
		for(int i = 1; i <= num; i++) {
				fact = fact * i;	
				
		   }
		System.out.println(fact);
		sc.close();
		
		}
		
}




