
public class Person {
	private String name;
	public Person(){
		setName(null);
		System.out.println(" Konstruktor ohne Parameter...");
		
	}
   
	public Person(String name){
    	setName("name");
    	System.out.println("Konstruktor mit 1 Parameter");
    	
    }
	public void setName(String name){
		this.name = name;
	}
    public String getName(){
    	return this.name;
    }
    public void ausgabe(){
    	System.out.println("ein Person mit name: " +this.name);
    }
}
