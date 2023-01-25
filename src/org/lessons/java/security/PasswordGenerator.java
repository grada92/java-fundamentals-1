package org.lessons.java.security;

public class PasswordGenerator {
	public static void main(String[] args) {
		
		String nome = "Paolo";
		String cognome = "Maldini";
		String colorePreferito = "rosso";
		
		int giornoDiNascita = 26;
		int meseDiNascita = 06;
		int annoDiNascita = 1968;
		
		int somma = giornoDiNascita + meseDiNascita + annoDiNascita;
		
		String password = nome + "-" + cognome + "-" + colorePreferito + "-" + somma ; 
		
		System.out.println(password);
		
	}
}
