package Misc;

public class Constructor {

	public static void main(String[] args) {
	
		Demo2 d=new Demo2(4);
		
		/**
		 * if we declare the constructor as Private 
		 * then it is not visible.
		 * you can change it back to the default / Package.
		 */
		

	}

}

class Demo{
	
	// int j;
	protected Demo()
	{
		
		System.out.println("A");
	}
	
	public Demo(int i)
	{     this();
		
		System.out.println("B");
	}
	
}



class Demo2 extends Demo{
	
	
	public Demo2(int i)
	{
		super (i);
		System.out.println("C");
	}
	
	
}