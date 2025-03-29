package core;

public class Variables {

	public static void main(String[] args) {
		
		
		Demo d=new Demo();
		
		Demo d2=new Demo();
		
		System.out.println(d.name.equals(d2.name)); //Value Check.
		System.out.println(d.name==d2.name); //Reference Check.
		
		System.out.println(d.name2==d2.name2);
		
		//System.out.println(d);
	}

}


class Demo{
	
	//Instance Variable.
	//Each class has it's own copy of this variable.
	//never not equals.
	String name=new String("Mahesh");
	
	
	//Static 
	//Initialized only once.
	//Class Variables.
	static String  name2="dada";
	
	
	
	public Demo()
	{
		char c='A';
		System.out.println(c);
		
	}
	
}