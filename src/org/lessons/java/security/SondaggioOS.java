package org.lessons.java.security;
import java.util.Scanner;

public class SondaggioOS {
	public static void main(String[] args) {
		
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quanti studenti hanno windows?");
		
		int StudentiWindows = input.nextInt();
		
		System.out.print("Quanti studenti hanno linux?");
		
		int StudentiLinux = input.nextInt();
		
		System.out.print("Quanti studenti hanno mac?");
		
		int StudentiMac = input.nextInt();
		
		int Totale = StudentiMac + StudentiWindows + StudentiLinux;

		double windowsTot = (StudentiWindows / (double) Totale ) * 100;
		double linuxTot = (StudentiLinux/ (double) Totale ) * 100;
		double macTot = (StudentiMac / (double) Totale) * 100;
		
		System.out.println("Percentuale studenti windows:" + windowsTot + "%");
		System.out.println("Percentuale studenti linux:" + linuxTot + "%");
		System.out.println("Percentuale studenti mac:" + macTot + "%");
		
		input.close();
		
		
		
		
		
		
		
		
		
	}
}
