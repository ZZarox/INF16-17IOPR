import java.util.Scanner;

public class Iopr1_Week1_Huiswerkopgave1 {

	public static void main(String[] args) {
		
		final long aantalSecondenInJaar = 365 * 24 * 60 * 60;	// 31.536.000
		final long aantalSecondenInDag = 24 * 60 * 60;			// 86.400
		final long aantalSecondenInUur = 60 * 60;				// 3600
		final long aantalSecondenInMinuut = 60;					
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Hoeveel seconden moeten er worden omgerekend? ");
		String aantalSecondenString = input.nextLine();
		
		// De invoer omzetten van String naar een int
		long aantalSecondenTotaal = Long.parseLong(aantalSecondenString);
		
		// Berekening van aantal seconden naar aantal jaren. 
		long aantalJaar = aantalSecondenTotaal / aantalSecondenInJaar;
		long aantalSecondenResterend = aantalSecondenTotaal % aantalSecondenInJaar;
		
		// Berekening van aantal resterende seconden naar dagen
		long aantalDagen = aantalSecondenResterend / aantalSecondenInDag;
		aantalSecondenResterend %= aantalSecondenInDag;
		
		// Berekening van aantal resterende seconden naar uren
		long aantalUren = aantalSecondenResterend / aantalSecondenInUur;		
		aantalSecondenResterend %= aantalSecondenInUur;
		
		// Berekening van aantal resterende seconden naar minuten
		long aantalMinuten = aantalSecondenResterend / aantalSecondenInMinuut;
		aantalSecondenResterend %= aantalSecondenInMinuut;
		
		// Resultaten worden getoond.
		System.out.println("Aantal jaar: " + aantalJaar);
		System.out.println("Aantal dagen: " + aantalDagen);
		System.out.println("Aantal uren: " + aantalUren);
		System.out.println("Aantal minuten: " + aantalMinuten);
		System.out.println("Aantal seconden: " + aantalSecondenResterend);
	}
}
