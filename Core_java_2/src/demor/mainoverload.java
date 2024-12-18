package demor;

public class mainoverload {

	public static void main(String[] args) {
		
		main(45);
		main(1000,5678);
		
		System.out.println("main method in main class !");
	}

	public static void main(int j)
	{
		System.out.println("main method with int variable !");
	}
	
	public static void main(int i, int j)
	{
		System.out.println("main method with two variables in main !");
	}
	
	public static void main(String str)
	{
		System.out.println("main method with ");
	}
}
