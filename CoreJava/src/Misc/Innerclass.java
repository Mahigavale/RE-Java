package Misc;

public class Innerclass {

	public static void main(String[] args) {
		
		outer out=new outer();
		
		outer.Inner inn=out.new Inner();
		
		
		out.Show();
		inn.innershow();
		
	}
}

class outer
{
	
	public void Show()
	{
		System.out.println("show method from the outer class.");
	}
	class Inner{
		
		public void innershow()
		{
			System.out.println("show from inner class.");
		}
	}
}