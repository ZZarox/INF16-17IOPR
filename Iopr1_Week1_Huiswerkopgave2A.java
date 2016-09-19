import java.util.Scanner;

public class Iopr1_Week1_Huiswerkopgave2A {

	public static void main(String[] args) {
		
		final double PI = 3.141592653;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inhoud van een cilinder wordt berekend.");
		
		// Invoer wordt gevraagd aan de gebruiker.
		System.out.print("Wat is de straal? ");
		double straal = input.nextDouble();
		System.out.print("Wat is de hoogte? "); 
		double hoogte = input.nextDouble();
		
		// Inhoud van de cilinder wordt berekend. 
		double inhoud = straal * straal * PI * hoogte;
		
		// Inhoud van de cilinder wordt getoond. 
		System.out.println("De inhoud van de cilinder is: " + inhoud);
	}
}