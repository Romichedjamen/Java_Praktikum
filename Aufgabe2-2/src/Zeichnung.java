import java.awt.*;
import javax.swing.*;

public class Zeichnung extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public void paint(Graphics g){
		g.setColor( Color.red );
		g.fillOval(40, 40, 50, 50);
		int zahl=6;
		
		for (int i=1;i<zahl;i++){
			g.setColor( Color.blue );
	       g.fillOval(40, 40, 50, 50);
			System.out.println(zahl);
			//color[] farbe = {color.black, color.gray, Color.white,new color(40,60,80),.,}
		  //  g.getColor( farbe[2]);
		}
		}

	public static void main(String[] args) {
		Zeichnung f = new Zeichnung();
		f.setSize(400, 400);
		f.setVisible(true);
		
		

	}

}
