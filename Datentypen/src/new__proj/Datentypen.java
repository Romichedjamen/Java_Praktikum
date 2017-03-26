package new__proj;

import tes.java.Tastatur;

public class Datentypen {

	public Datentypen() {
		
	}

	public static void main(String[] args) {
    boolean  weiter = false;
    //boolean  weiter = false && true;
    char ch = 'A';
    int abc = 7;
    //boolean abc = 7 < 17; 
   // boolean abc = 17 >16 && ch == 65 ;
   // int abc = 7 | 0x2a;
    char c = 'c';
    if (ch >  c );
    //int abc = (7/12 );
    short sh =15;
    float flo =3.24F;
    double dub = 10.7; 
    String wort = "Hallo" ;
    
    System.out.println( weiter + " - " + ch + " - " + abc+ " - " + sh + " - " + flo + " - " + dub + " - " + wort );
  //e
    System.out.println( !weiter && true);
    System.out.println( abc == 17);
    //zuweisung
    System.out.println(abc = 17);
    System.out.println( abc >16);
    System.out.println(abc > 16 && ch == 65 );
    System.out.println( abc | 0x2a );
    System.out.println(Integer.toBinaryString(0x2a));
    System.out.println(Integer.toBinaryString(abc));
    System.out.println( abc / 12d);
    System.out.println( abc % 12);
    System.out.println(Math.rint(dub% 12)*100/100);
    dub = 3.14f ;
    System.out.println(dub );
    flo =(float) 5.67;
    System.out.println( flo);
    wort += " Welt";
    System.out.println(wort);
    int i = 23;
    System.out.println(--i);
    System.out.println(i);
    System.out.println( ch < 'C');
    ch = (char) ( ch + 5);
    System.out.println(ch);
    for(int k = 0; k < 3 ;k++){
        sh *= 15;
	    System.out.println(sh);
    }
 

 
    
    
    
   int[] ifeld = new int [20];
   String[] worte = new String [10];
   ifeld [2]  = 5;
      
   //int[] feld1 = { 2 };
   System.out.println( ifeld[0] + ";" +ifeld[1] + "; " + ifeld [2]+ "; " + ifeld [3]+ "; " + ifeld [4] );
   worte [0] = "wer";
   worte [1] = "reitet";  
   
   worte [2] = "so";   
   worte [3] = "spät"; 
   System.out.println( worte[0] + ";" +worte[1] + "; " + worte [2]+ "; " + worte [3]+ "; " + worte [4] );
   
   boolean[] myarr = new boolean[1];
   System.out.println(myarr[0]);
   
    
    
	}

}
