

public class Person {

	
	
	private String name;
	private int alter;
	
	public Person(String name, int alter){
		this.alter = alter;
		this.name = name;
	}
	
/*
	//my comment
	//private Integer alter2 = null;
	gsgsg
	fdg
	*/
	public int getAlter(){
		// diese Methode gibt da Alter an
		return alter;
	}
	
	
	public void setAlter(int alter){
		this.alter = alter;
	}
	
	public String toString(){
		
		String string1 = "Hallo ich bin "+ name + " und ich bin "+ alter +" Jahre alt.";
		return string1 ;
	}
	
	
	public static void main(String[] args){
		
	/*	String[] myArray = new String[5];
		myArray[0] ="Romiche";
	    myArray[1] ="lkjfaö";
	    System.out.println(myArray[1]);*/
		

		if(args.length == 0){
			Person romiche = new Person( "Romiche", 21);
			System.out.println(romiche);
			Person ich = new Person ( "Matthias", 28);
			System.out.println(ich);
		}else if(args.length == 2){
			int age = Integer.parseInt(args[1]);
			Person myperson = new Person(args[0], age);
			System.out.println(myperson);
		}else{
			System.out.println("Dieses Programm wird auf folgende Weise benutzt: java -jar myPerson.jar [name] [alter]");
		}
		
		boolean myBool = false;
	    boolean mybool2 = false;// = obj.length == 1;
	    System.out.println(myBool && (mybool2 || args.length == 0));
	    // ! & | true false == < > >= <=
	    System.out.println(8 < 8);
	    int myint = 5 >> 1;
	    System.out.println(myint);
	    String binary = Integer.toBinaryString(myint);
	    System.out.println(binary);
	    char mychar = '\n';
	    System.out.println((int) mychar);
	    
	    char[] zeichenArray = new char[]{18,2,111,55,96, '\n', 'b'};
	    System.out.println(String.valueOf(zeichenArray));
	}
	
	
	
}
