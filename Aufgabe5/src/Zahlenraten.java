import java.io.IOException;

public class Zahlenraten {

	public static void main(String[] args) throws IOException {
	int zahl;
	
	do{
	System.out.println("Rate diese zahl: ");
	zahl = Tastatur.LeseInt();
	}
	while( zahl <= 12);
		System.out.println("Meine zahl ist kleiner! ");
		zahl++;
		for (int i=1; i<3; i++)
		zahl = Tastatur.LeseInt();
		//System.out.println("Meine zahl ist kleiner! ");
		System.out.println("Du hast meine Zahl beim 3. Versuch erraten! " +zahl);
		
		
		
	}}










	/*while(zahl<=12);
	// zahl = Tastatur.LeseInt();
	//50
	System.out.println("Meine zhal ist kleiner! ");/*
}}

 * while(zahl<=12);
 * while(zahl >= 25);{ zahl = Tastatur.LeseInt(); } /*while (zahl >=12); zahl =
 * Tastatur.LeseInt();
 */
