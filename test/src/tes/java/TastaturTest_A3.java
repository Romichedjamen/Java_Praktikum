package tes.java;

import java.io.IOException;

public class TastaturTest_A3 {

	public TastaturTest_A3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		//int Alter=4;
		//int Kind = 4;
		//int Kiachsener = 18;
		//int Senior = 60;
		System.out.println("Wie alt bis du?");
		System.out.print("> ");
		int alter = Tastatur.LeseInt();
		System.out.println("Ich bin " + alter+ " Jahre alt.");

		if (alter < 18) {
			System.out.println("Ich bin ein Kind." );

		} else if (18 <= alter && alter < 65) {
			System.out.println("Ich bin ein Erwachsener. " );
		}else if (alter >= 65) {
			System.out.println("Ich bin ein Senior. " );
		}

	}

}
