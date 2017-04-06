
public class Kapital {

	public static void main(String[] args) {
		double x[] = new double[60000];
		double z =0.06;
		int n=5;
		double k = 30;
		for(int i=0; i<n ; i++){
			x[i] = k*(1+z);
			System.out.println(x[i]);
		}
			
		

	}

}
