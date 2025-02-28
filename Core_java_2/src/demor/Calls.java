package demor;

public class Calls {

	public static void main(String[] args) {
		
		
		
		//polymorphic Object Creation , Upcasting => Abstraction as the methods only defined in 
		//parent interface defined are accessed here.
		
		
		// anonymous inner classes, static and non static  inner classes(instance inner classes). and accessing them.
		
		// exception handling , automatic, manually using throw and throws and custom
		
		// pipe operator in exception handling (|) to catch the multiple exceptions.
		

		// demo d=new demo();
		 
		 demo.inner  d=new demo.inner(); //accessing the static inner class directly.
		 
		 d.demo_method();
		 
		 
		 demo d2=new demo();
		 
		 demo.outer d3= d2.new outer();
		 
		 d3.demo_outer();
		 
		
	}

}
class demo {

	 int i;
	 
	 public demo ()
	 {
		// this.i=i;
	 }
	 
	 public int geti()
	 {
		 return i;
	 }
	 
	 static class inner{
		 
		 public void demo_method()
		 {
			 System.out.println("Static");
		 }
	 }
	 
	 class outer{
		 
		 public void demo_outer()
		 {
			 System.out.println("Non Static !");
		 }
	 }

}




