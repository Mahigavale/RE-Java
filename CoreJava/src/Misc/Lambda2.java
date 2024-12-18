package Misc;

public class Lambda2 {

	public static void main(String[] args) {
		
		/**
		 * lambda expressions are used in the conjunction with the functional interfaces
		 * when there is nothing new addition but only to override the abstract method.
		 * it is an exception to the anonymous class.
		 */
		
		
		Iman man=new Iman()
				{
			        public void display()
			        {
			        	System.out.println("overridden  method in js.");
			        }
				};
	
	
	
	Iman man2=()->System.out.println("overridden method from intreface re !");
	
	man.display();
	man2.display();
	
	

}

}

@FunctionalInterface
interface Iman {
	
	public void display();
	
	
	public default  void display_implementation()
	{
		
		System.out.println("Interface method with the implementation.");
	}
	
	
	public default int display_return_one()
	{
		return 1;
	}
}