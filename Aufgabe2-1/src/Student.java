
public class Student extends Person {
	private int matrNr;
	private int jahr;
	public Student(){
		super();
		matrNr= 0;
		jahr=0;
		System.out.println(" Parametrloser Konstruktor...");
		
	}
   public Student(String name, int mn, int j){
	   super("rom ");
	   matrNr= mn;
	   jahr=j;
	   System.out.println("Konstruktor mit 2 Parameter..");
	   
   }
   public void setMatrNr(int mn ){
	   if(matrNr<=10000 && matrNr>=50000)
	   matrNr = mn;
	   else
		   System.err.println("Fehlermeldung: " +-1);
   }
   public void setJahr(int j){
	   jahr = j;
   }
   public int getMatrNr(){
	   return matrNr;
   }
   public int getJahr(){
	   return jahr;
   }
   public void anzeige(){
	   System.out.println("der Student mit matrikelnummer: "+ this.matrNr+"ist:" + this.jahr+"jahre alt.");
	   ausgabe();
   }
  
}
