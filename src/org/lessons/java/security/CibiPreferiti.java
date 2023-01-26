package org.lessons.java.security;

public class CibiPreferiti {
	public static void main(String[] args) {
		
		String[] Cibi = { "Cioccolato" , "Banana" , "Marmellata" , "Pasta" , "Uova" , "Pesce"};
		
		// Stampo Array attraverso ciclo for
		
		for(int i = 0;i < Cibi.length;i++)
			
            System.out.println(Cibi[i]);  
		
			System.out.println("Cibo Preferito: " + Cibi[0]); 
			
			System.out.println("Cibo Non Preferito: " + Cibi[Cibi.length -1]); 
			
			// BONUS
			
			System.out.println("Cibo Metà Array: " + Cibi[Cibi.length / 2 -1]); 
			
			
			
	}
}
