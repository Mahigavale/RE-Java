package Misc;

public class FunctionalInterfacedemo {

	public static void main(String[] args) {
		
		Idemo dem=()-> System.out.println("Implementatin !");
		
		
	dem.demo();
	
	
	
	Idemo dem2=new Idemo()
			{
		public void demo()
		{
			System.out.println("the over-ridden method !");
		}
			};
			
			dem2.demo();
			
	}

}


@FunctionalInterface
interface Idemo{
	
	
	public void demo();
	
	 default public void methodimpl()
	{
		System.out.println("method with the implementation !");
	}
	
	
}