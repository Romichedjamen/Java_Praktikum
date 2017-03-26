
public class Eingabe {
	
	float fo = 12f;
	

	public Eingabe() {
	
	}

	public static void main(String[] args) {
		//System.out.println("\n Ich heisse : " + args[0]);
		int n = Integer.parseInt(args[0]); 
		
		double m = Double.parseDouble( args[0]);
		System.out.println(Math.sqrt(m));
		
		/*if (args.length == 3){
			System.out.println("\n Ich heisse : " + args[0] + " , " + args[1]+" plus:" + args[2]);			
		}else
			if (args.length == 2)
				System.out.println("\n Ich heisse : " + args[0] + " , " + args [1]);
		
		*/		
  /*  String txt = "Romiche Djamen" ;
   // int abc;
   // abc = Integer.parseInt(txt);
    System.out.println("\n Ich heisse : " + txt);
    txt = Integer.toString(21);
    System.out.println(" Ich bin : "+ 21);*/
	}

}