package Misc;

public class Abstraction {

	public static void main(String[] args) {
		
		
				
		demo d=new demo()
				{
			 void demo2()
			 {
				 System.out.println("demo abstract method overridden here !");
			 }
				};
				
				d.demo2();
				
				Ianimal anm=new Ianimal()
						{
					      @Override
					      public void sound() {
					    	  System.out.println("overridden !");
					      }
						};
						
						anm.sound();
				
	}

}


abstract class demo{
	
	abstract void demo2();
	
	public void show()
	{
	 System.out.println("the show from demo !");
	}
}


interface Ianimal{
	
	void sound();
}