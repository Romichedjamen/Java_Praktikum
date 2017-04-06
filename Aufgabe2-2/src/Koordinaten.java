import java.awt.*;
import javax.swing.*;

public class Koordinaten extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static int xskal(double x,double xmin, double xmax, double xfact){
		
	
	double[] x = new double [3];
	 xmin=0 ;xmax = 2;
      xfact=(xmax1-xmin1)/(xmax-xmin);
	 
	// int[] y ={0,2,0};
	 double[] y = new double[3];
	double ymin=0 , ymax = 2;
      int[] xs = new int[3];
	if(xs.length <=150 && xs.length>=250)
	 int[] ys = new int[3];
	if(ys.length <=150 && ys.length>=250)
		System.out.println(xs+" "+ ys );
	
	public void paint(Graphics g){
	g.setColor( Color.red );
	g.fillOval(40, 40, 50, 50);
	}
	
	}
	public static void main(String[] args) {

		Koordinaten f= new Koordinaten();
		f.setSize(600,500);
		f.setVisible(true);
		
	}

}
