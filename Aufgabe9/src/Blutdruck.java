
public class Blutdruck {

	private String patient;
	private int dia;
	private int sys;
	
	public void ausgeben() {
		System.out.println(toString());

	}
    public void besetzen (String patient, int dia, int sys){
    	this.patient = patient;
    	this.dia = dia;
    	this.sys = sys;
    }
   
     public String getPatient(){
    	return this.patient;
     }
     public int getDia(){
    	 return dia;
    	 
     }
     public int getSys(){
    	 return sys;
     }
     public void setDia(int dia){
    	 this.dia= dia;
     }
     public void setSys(int sys){
    	 this.sys = sys;
     }
    public void setPatient(String patient){
    	this.patient = patient;
    }
    public double getMad(){
    	double mad = dia+(1d/3d)*(sys-dia);
    	return  mad;
    }
    
    @Override
    public String toString() {
    	
    	return "Blutdruck von " + patient + ":" + dia + "-" + sys;
    }


}
