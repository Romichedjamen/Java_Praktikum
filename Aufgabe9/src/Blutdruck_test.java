
public class Blutdruck_test {

	public Blutdruck_test() {

	}

	public static void main(String[] args) {

		Blutdruck bd = new Blutdruck();
		bd.setPatient("Meier");
		bd.setDia(80);
		bd.setSys(120);
		bd.ausgeben();
		bd.besetzen("HugoBoss", 90, 135);
		bd.getPatient();
		//bd.getMad();
		//System.out.println("Blutdruck von " + bd.getPatient() + ":" + bd.getDia() + "-" + bd.getSys());
		bd.ausgeben();
        System.out.println(bd.getMad());
        System.out.println(bd);
	}

}
