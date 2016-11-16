package org.bilbosnia.kalk;

public class Operacije {
	
	public static void sabiranje (double a, double b) {
		
		System.out.println(a + b);
		
	}
	
	public static void oduzimanje (double a, double b) {
		
		System.out.println(a - b);
		
	}
	
	public static void mnozenje (double a, double b) {
		System.out.println(a * b);
	}
	
	public static void djeljenje (double a, double b) {
		if (b == 0)
			System.out.println("Greska (djeljenje nulom)!");
		else
			System.out.println(a / b);
	}
	
	public static void korjenovanje (double a) {
		
	}
	
	public static void kvadriranje (double a) {
	
	}


}
