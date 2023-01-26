package org.lessons.java.security;
import java.util.Scanner;

public class CheckGuest {
	public static void main(String[] args) {

		
		
		String[] Guests= { 
				"Dua Lipa","Paris Hilton", "Manuel Agnelli", "J-Ax","Francesco Totti","Ilary Blasi","Bebe Vio", "Luis", "Paradais Zarei", "Martina Maccherone","Rachel Zeili"
		};
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci il tuo Nome e Cognome");
		
		String nominativo = input.nextLine();
		
		boolean Presente = false;
		
		for(int i=0; i < Guests.length ; i++) {
			
			if(nominativo.toLowerCase().trim().equals(Guests[i].toLowerCase().trim())) {
				
				Presente =true;
				
			}
		}
		if(Presente) 
			System.out.println("Ciao " + nominativo + " puoi entrare");
		
		else System.out.println("Mi dispiace " + nominativo + " non puoi entrare" );
		
		input.close();
	}
}
