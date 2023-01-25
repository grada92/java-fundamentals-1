package org.lessons.java.security;

public class SondaggioOS {
	public static void main(String[] args) {
		
		int students = 30;
		
		int windows  = 10;
		int linux = 6;
		int mac = 14;
		
		double windowsMedia = (double) (windows * 100 / students);
		double linuxMedia = (double) ((linux * 100) / students);
		double macMedia = (double) ((mac * 100)/ students);
		
		System.out.println(windowsMedia + "%");
		System.out.println(linuxMedia + "%");
		System.out.println(macMedia + "%");
	
	
		
		
	}
}
