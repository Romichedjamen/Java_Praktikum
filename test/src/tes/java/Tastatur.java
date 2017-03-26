package tes.java;
// LeseMethoden fuer einfache Datentypen 
// basiert auf Paket 'javagently' von J.M. Bishop 
// Muss im selben Verzeichnis stehen wie der nutzende Quelltext (kein package)

//package iotools;

import java.io.*;
import java.util.*;
import java.text.*;

public class Tastatur {

  public Tastatur() {};

  /* The All New Famous Text class     by J M Bishop  Aug 1996
   *            revised for Java 1.1 by Alwyn Moolman Aug 1997
   *            revised for efficiency by J M Bishop Dec 1997
   * 
   * Provides simple input from the keyboard and files.
   * Now also has simple output formatting methods
   * and file opening facilities.
   *
   * public static void   prompt (String s)
   * public static int    readInt (BufferedReader in)
   * public static double readDouble (BufferedReader in)  
   * public static String readString (BufferedReader in)  
   * public static char   readChar (BufferedReader in) 
   * public static String writeInt (int number, int align)
   * public static String writeDouble 
                   (double number, int align, int frac)
   * public static BufferedReader open (InputStream in)
   * public static BufferedReader open (String filename)
   * public static PrintWriter create (String filename)
   *  public static int LeseInt ( )
   *  public static int LeseDouble ( )
   *  public static int LeseChar ( )
   * 
   * 
   * 
   * ergaenzt um Methoden zur einfachen Eingabe : 
   * 
   */

  private static StringTokenizer T;
  private static String S;

  public static BufferedReader open (InputStream in)  {
    return new BufferedReader(new InputStreamReader(in));
  }

  public static BufferedReader open (String filename) 
	throws FileNotFoundException {
    return new BufferedReader (new FileReader (filename));
  }
  
  public static PrintWriter create 
	 (String filename) throws IOException {
    return new PrintWriter (new FileWriter (filename));
  }

  public static void prompt (String s) {
    System.out.print(s + " ");
    System.out.flush();
  }

  public static int readInt (BufferedReader in) throws IOException {
      if (T==null) refresh(in);
      while (true) {
        try {
          return Integer.parseInt(T.nextToken());
        }
        catch (NoSuchElementException e1) {
          refresh (in);
        }
        catch (NumberFormatException e2) {
//          System.out.println("Error in number, try again.");
          System.out.println("falsches Format, neue Eingabe ");
        }
      }
   }

 public static char readChar (BufferedReader in) throws IOException {
      if (T==null) refresh(in);
      while (true) {
        try {
          return T.nextToken().trim().charAt(0);
        }
        catch (NoSuchElementException e1) {
          refresh (in);
        }
      }
   }

 public static double readDouble (BufferedReader in) throws IOException {
      if (T==null) refresh(in);
      while (true) {
        try {
          String item = T.nextToken();
          return Double.valueOf(item.trim()).doubleValue();
        }
        catch (NoSuchElementException e1) {
          refresh (in);
        }
        catch (NumberFormatException e2) {
          System.out.println("falsches Format, neue Eingabe ");
          //System.out.println("Error in number, try again.");
        }
      }
   }

  public static String readString (BufferedReader in) throws IOException {
    if (T==null) refresh (in);
    while (true) {
      try {
        return T.nextToken();
      }
      catch (NoSuchElementException e1) {
        refresh (in);
      }
    }
  }

  private static void refresh (BufferedReader in) throws IOException {
    S = in.readLine ();
    if (S==null) throw new EOFException();
    T = new StringTokenizer (S);
  }



  //  Write methods
  //  -------------

  private static DecimalFormat N = new DecimalFormat();
  private static final String spaces = "                    ";

  public static String writeDouble (double number, int align, int frac) {
    N.setGroupingUsed(false);
    N.setMaximumFractionDigits(frac);
    N.setMinimumFractionDigits(frac);
    String num = N.format(number);
    if (num.length() < align)
      num = spaces.substring(0,align-num.length()) + num;
    return num;
  }

  public static String writeInt (int number, int align) {
    N.setGroupingUsed(false);
    N.setMaximumFractionDigits(0);
    String num = N.format(number);
    if (num.length() < align)
      num = spaces.substring(0,align-num.length()) + num;
    return num;

  }

  //  simple Eingabe von primitiven Datentypen  
  //  -------------

   //   Eingabe einer Ganzzahl  
   public static int LeseInt ( )  throws IOException
   {
     BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
     return Tastatur.readInt(in); 
   }
   
   //   Eingabe einer double  
   public static double LeseDouble ( )  throws IOException
   {
     BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
     return Tastatur.readDouble(in); 
   }
  
   //   Eingabe einer char  
   public static char LeseChar ( )  throws IOException
   {
     BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
     return Tastatur.readChar(in); 
   }

   //   Eingabe eines String  
   public static String LeseString ( )  throws IOException
   {
     BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
     return Tastatur.readString(in); 
   }
   
   public static void main(String[] args) throws IOException {
	   
	
		//double x = Tastatur.LeseDouble();
		System.out.println("Wie hei�t du?");
		System.out.print("> ");
	
		String name = Tastatur.LeseString();
		System.out.println("Hallo  "+ name);

}

  
  
}
