package tes.java;

import java.io.IOException;

public class TastaturTest_A2 {

	public static void main(String[] args) throws IOException {

		double a = 1, x1, x2, y;
		double b = 0;
		double c = -4;
		System.out.println("Eingabe f�r a: ");
		System.out.print("> ");
		a =Tastatur.LeseDouble();
		System.out.println("Eingabe f�r b: ");
		System.out.print("> ");
		b =Tastatur.LeseDouble();
		System.out.println("Eingabe f�r c: ");
		System.out.print("> ");
		c =Tastatur.LeseDouble();
		System.out.println("Eingabe: a " + a + " b " + b + " c " + c);
		if (b * b - 4 * a * c < 0) {
			System.out.println("L�sung: " + Double.NaN);
		} else {
			y = Math.sqrt(b * b - 4 * a * c);
			x1 = -b + y / 2 * a;
			x2 = -b - y / 2 * a;
		
			//System.out.printf(Math.rint(x1 * 100)/100 + " - " + x2);
			System.out.printf("L�sungen: x1: %.3f, x2: %.3f\n", x1 , x2);
		}
		// int Alter =21;
	}

}
