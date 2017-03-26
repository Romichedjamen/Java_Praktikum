package new__proj;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Datentypen1 {

	public Datentypen1() {

	}

	public static void main(String[] args) {
		boolean weiter = false;
		char ch = 'A';
		int abc = 7;
		short sh = 15;
		float flo = 3.14F;
		double dub = 10.7;
		String wort = "Hallo";
		System.out.println(weiter + "-" + ch + " - " + abc + "-" + sh + "-" + flo + "-" + dub + "-" + wort);
        System.out.println(!weiter &&true);
	    System.out.println(abc<17);
	    System.out.println( abc = 17 );
	    System.out.println(abc > 16 && ch==65);
	    System.out.println(abc|0x2a);
	    System.out.println(abc/12);
	    System.out.println(abc%12);
	    System.out.println(Math.rint(dub/3)*100/100);
	    dub=3.14f;
        System.out.println(dub);
	    flo =(float)5.67;
	    System.out.println(flo);
	    wort = "Hallo welt";
	    System.out.println(wort);
	    System.out.println(ch< 'c');
	    ch = (char) (ch + 5);
	    System.out.println((int)ch);
	    
	    
	    
	    
	    
	    
	
	
	}   

	

}
