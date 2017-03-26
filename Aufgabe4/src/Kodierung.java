import java.io.IOException;

public class Kodierung {

	public Kodierung() {

	}

	public static void main(String[] args) throws IOException {
		/*char[] text = new char[10];
		text[0] = 'h';
		text[1] = 'a';
		text[2] = 'l';
		text[3] = 'l';
		text[4] = 'o';
         int i=0;
		 while (i <5) {
         System.out.printf("%c",text[i]);
         i++;
		 }
		 System.out.println();
		 
		 

		 for (int s = 0;s<5;s++){
			 char h = text[s];
			 if (h>='a'&& h<='z'){
				 h = (char) (h - 32);
				text[s]=h; 
			 }
			 
			 System.out.printf("%c",text[s]);
		 }*/
		 System.out.println("...............");

		 	
			char[] feld = new char[8];
			feld[0] = 'Q'; 
			feld[1] = 'd';
			feld[2] = 'b';
			feld[3] = 'd';
			feld[4] = 'o';
			feld[5] = 'v';
			feld[6] = 'r';
			feld[7] = '$';
			
			
			/*System.out.println("Was ist die Codezahl?");
			System.out.print("> ");
		 	int codezahl = Tastatur.LeseInt();*/
	/*  for (int codezahl = -50; codezahl <=50; codezahl++){
		  System.out.print("Code: "+codezahl+": ");
		for (int s = 0; s < 8; s++) {
			char h = feld[s];
			h = (char) (h + codezahl);
			//feld[s] = h;

			System.out.printf("%c", h);
			
		}
		System.out.println();
	}*/
		System.out.println("Was ist die Codezahl?");
		System.out.print("> ");
	 	int codezahl = Tastatur.LeseInt();
	  
		for (int s = 0; s < 8; s++) {
			char h = feld[s];
			h = (char) (h + codezahl);
			//feld[s] = h;

			System.out.printf("%c", h);
			
		}
		    
		    
		 /*System.out.println();
		char h = text[0];
		
		 h = (char) (h - 32);
		char a = 'a';
		a = (char) (a - 32);
		char l = 'l';
		l = (char) (l - 32);
		char ch = 'l';
		ch = (char) (ch - 32);
		char o = 'o';
		o = (char) (o - 32);
		
		System.out.println((char) h + "-" + a + "-" + l + "-" + ch + "-" +o);/*

		/*if (h >= 'a')
			h = (char) (h - 32);
		System.out.println((char) h);
		if (a >= 'a')
			a = (char) (a - 32);
		System.out.println(a);
		if (l >= 'a')
			l = (char) (l - 32);
		System.out.println(l);
		if (ch >= 'a')
			ch = (char) (ch - 32);
		System.out.println(ch);
		if (o >= 'a')
			o = (char) (o - 32);
		System.out.println(o);

		System.out.println((char) h + "-" + a + "-" + l + "-" + ch + "-" +o);
		System.out.println((char) text[0] + "-" + text[1] + "-" + text[2] +
		 "-" + text[3] + "-" + text[4]);
		System.out.printf("die Kodierung des Wortes ist: %c", h, a, l, ch,o);
		char[] feld = new char[8];
		feld[0] = 'Q'; char Q ='Q';Q = (char)(Q+3);
		feld[1] = 'd';
		feld[2] = 'b';
		feld[3] = 'd';
		feld[4] = 'o';
		feld[5] = 'v';
		feld[6] = 'r';
		feld[7] = '$';
		System.out.println((char) feld[0] + "-" + feld[1] + "-" + feld[2]);
	    System.out.println((char)Q);*/
	}

}
