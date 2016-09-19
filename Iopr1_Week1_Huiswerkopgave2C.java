import java.util.Scanner;

public class Iopr1_Week1_Huiswerkopgave2C {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("BMI wordt berekend.");
		
		// Invoer wordt gevraagd aan de gebruiker.
		System.out.print("Hoeveel kilogram weeg je? ");
		double kilogram = input.nextDouble();
		System.out.print("Wat is je lengte in meters? "); 
		double meters = input.nextDouble();
		
		// BMI wordt berekend.
		double bmi = kilogram / (meters * meters);
		
		// BMI wordt getoond.
		System.out.println("Uw BMI is: " + bmi);
	}
}
