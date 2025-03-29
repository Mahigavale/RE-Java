package core;

public class Classdemo {

	public static void main(String[] args) {
	
		
		Demo_a a=new Demo_a();
		
		Demo_a.demo_static.Display_from_static();
		Demo_a.demo_instance i= a.new demo_instance();
		i.Display_from_instance();
		
		Demo_a.demo_final f= a.new demo_final();
		
		// f.i=45;
		 
		 f.Display_i();

	}

}

class Demo_a{
	
	public void display()
	{
		System.out.println("display from the demo-d");
	}
	
	static class demo_static{
		
		
		public  static void Display_from_static()
		{
			System.out.println("display from static...");
		}
	}
	
	class demo_instance{
		
		public void Display_from_instance()
		{
			System.out.println("display from instance...");
		}
	}
	
	final class demo_final{
		
		 final int i=23;
		
		public void Display_i()
		{
			System.out.println(i);
		}
	}
}

