package Misc;

public class Constructor {

	public static void main(String[] args) {
	
		Demo2 d=new Demo2(4);
		System.out.println(d);
		
		/**
		 * if we declare the constructor as Private 
		 * then it is not visible.
		 * you can change it back to the default / Package.
		 */
		

	}

}

class Demo34{
	
	// int j;
	protected Demo34()
	{
		
		System.out.println("A");
	}
	
	public Demo34(int i)
	{     this();
		
		System.out.println("B");
	}
	
}



class Demo2 extends Demo34{
	int j;
	
	public Demo2(int i)
	{
		super (i);
		j=78;
		System.out.println("C");
		System.out.println("instacne variable intialized :"+ j);
	}
	
	
}