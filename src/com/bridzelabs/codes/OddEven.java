package com.bridzelabs.codes;

/**
 * 
 * @author pande
 *
 */
public class OddEven {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/**
		 * to print odd and even in parallel and to calculate the sum
		 */
		int even = 0,odd = 0;
		int totalOfOdd = 0,totalOfEven = 0;
		for(int i = 1; i <= 20; i++) {
			if(i % 2 != 0) {
				 odd = i;
				 totalOfOdd = totalOfOdd+odd;
			}
				else {
				 even = odd + 1;
				 totalOfEven = totalOfEven + even;
				 System.out.println(odd +"\t" + even);
			}
		}
		System.out.println("---------------");
		System.out.println(totalOfOdd +"\t" + totalOfEven);
		System.out.println("----------------");
		
				
		
	}

}

