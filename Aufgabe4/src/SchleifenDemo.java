
public class SchleifenDemo {

	public SchleifenDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String[] sentence = new String[]{"Hallo,","ich", "heiﬂe","Romiche."};
		
		for (int i = 0; i < sentence.length; i++) {
			if(i == 2)
				continue;
			
			System.out.print(sentence[i]);
			
			
			if(i == sentence.length -1)
				System.out.println();
			else
				System.out.print(" ");
		}
		
		int j  = 0;
		while (j < 5) {
			System.out.println("I did it (with while)! "+j);
			j++;
		}
		
		boolean doIt = false;
		
		do {
			doIt = false;
			if(doIt==false)
				break;
			System.out.println("I did it (with do-while)! With doIt = "+doIt);
		} while (doIt);

	}

}
