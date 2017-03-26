
public class Kreisflaeche {

	public Kreisflaeche() {
		met(1,2);
	}
	
	public double met(int in){
		return (double) in;
	}
	
	
	public double met(int in, int i2){
		return (double) in*2;
	}

	public static void main(String[] args) {
		Kreisflaeche ks = new Kreisflaeche();
		ks.getClass();
	double radius;
	double durchmesser;
	double umfang;
	
	radius =5;
	durchmesser = 2 * radius;
	
    System.out.println("Radius = " + radius );
	umfang = 3.14156 * durchmesser;
	System.out.println( "Umfang=" + umfang);
	//Programm zum Berechnen einer Kreisflaeche
    // Progamm ende
	
	
	
	double radius1 = 100;
	double rquadrat; 
	int flaeche;
    
    //radius1 = 20;
    System.out.println ("Radius =" + radius1);
  //System.out.print("a\nd\tf\n");veux dire vas a la ligne
    
    rquadrat = radius1*radius1;
   System.out.println("Radius-Quadrat : " + rquadrat);
   
    flaeche = (int) (3.14195*rquadrat);
    System.out.println("Flaeche = " + flaeche);
    //Programm zum Berechnen einer Umfang
  
    }
}
	

	 
	
	
	

