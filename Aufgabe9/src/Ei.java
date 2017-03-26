
public class Ei {
	private int haltung;
	private String land;
	private int identCode;

	public Ei() throws Exception {


	}

	public Ei(int h, String l, int i)  {
		setLand(l);
		setIdentCode(i);
		setHaltung(h);

	}
	public void setHaltung(int h) {
		if (h<= 4 && h>=0)
		    haltung = h;
		else{
			haltung = 99;
		    land = "xx";
		    System.err.println("Fehler: ung�ltiger Wert f�r Haltung.\n");
		    //2. M�glichkeit
		    //throw new Exception("Fehler: ung�ltiger Wert f�r Haltung.");
		}
	}

	public void setLand(String l) {
		land = l;
	
	}

	public void setIdentCode(int i) {
		this.identCode = i;
	}

	public int getHaltung() {
		return this.haltung;
	}

	public String getLand() {
		return this.land;
	}

	public int getIdentCode() {
		return this.identCode;
	}

	public void zeigDaten() {
		System.out.println(+haltung + "," + land + "," + identCode);
	}

}
