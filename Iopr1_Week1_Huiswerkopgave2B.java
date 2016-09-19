import java.util.Scanner;

public class Iopr1_Week1_Huiswerkopgave2B {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Het gemiddelde van 3 hele getallen wordt berekend.");
		
		// Invoer wordt gevraagd aan de gebruiker.
		System.out.print("Wat is het 1e gehele getal? ");
		int getal1 = input.nextInt();
		System.out.print("Wat is het 2e gehele getal? ");
		int getal2 = input.nextInt();
		System.out.print("Wat is het 3e gehele getal? ");
		int getal3 = input.nextInt();
		
		// De gravitatiekracht wordt berekend. 
		double gemiddelde = getal1 + getal2 + getal3 / 3.0;
		
		// Het gemiddelde van de 3 getallen wordt getoond. 
		System.out.println("De gemiddelde van de 3 getallen is: " + gemiddelde);
	}
}
