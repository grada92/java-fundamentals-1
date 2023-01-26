package org.lessons.java.security;

public class FizzBuzz {
	public static void main(String[] args) {
		
		// Stampo numeri da 1 a 100
		
		for (int i = 1; i <= 100; i++) {
		
		// Se multipli di 3 e di 5
			
			if (i % 3 == 0 && i % 5 == 0) {

				System.out.println(i + "FizzBuzz");
		// Se multipli di 3
				
			} else if (i % 3 == 0) {

				System.out.println(i + "Fizz");
		// Se multipli di 5
				
			} else if (i % 5 == 0) {

				System.out.println(i + "Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}
