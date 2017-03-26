
public class Lottozahlen {

	public Lottozahlen() {
		
	}

	public static void main(String[] args) {
		int zufall;
		// maximalwert der zufallszahl:
		double n = 49;
		int i = 0;
		/* B)
		//Gib 6 zufallszahlen aus:
		while (i <= 6) {
			// 1 Zufallszahl erzeugen:
			zufall = (int) (Math.random() * n) + 1;
			System.out.println(zufall);
			i++;
		}*/
		
		//C
		//Gib 6 zufallszahlen aus:
		int[] array = new int[6];

		while (i < 6) {
			// 1 Zufallszahl erzeugen:
			zufall = (int) (Math.random() * n) + 1;
			array[i] = zufall;
			
			i++;
			
		}
		
		i=0;
		while (i<6) {
			
			System.out.println(array[i]);
			i++;
		}

	}

}
