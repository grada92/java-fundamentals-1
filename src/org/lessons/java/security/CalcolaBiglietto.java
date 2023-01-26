package org.lessons.java.security;
import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {
		//Biglietto del treno
		
		// km = 0,21 EURO
		
		double PrezzoKm = 0.21;
		
		
		Scanner s = new Scanner(System.in);
		
		// Chiedo Età Utente
		System.out.print("Quanti anni hai?");
		
		int etaPasseggero = s.nextInt();
		
		// Chiedo quanti km vuole percorrere
		System.out.print("Quanti Km vuoi percorrere?");
		
		double Km = s.nextInt();
		
		//Calcolo Prezzo Totale
		
		double PrezzoTotale  = Km * PrezzoKm ;
		
		if (etaPasseggero < 18) {
		// Calcolo Sconto del 20% 
		System.out.println((PrezzoTotale - (PrezzoTotale*20/100)) + " Euro");
		}
		// Calcolo Sconto del 40%
		if (etaPasseggero > 65) {
		System.out.println((PrezzoTotale - (PrezzoTotale*40/100)) + " Euro");
		} else {
			
		System.out.println(PrezzoTotale + " Euro");
		
		}
		
		s.close();
	}
}
