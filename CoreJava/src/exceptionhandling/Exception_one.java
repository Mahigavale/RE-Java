package exceptionhandling;

public class Exception_one {

	public static void main(String[] args) {
	
		
		int i=0;
		int j=10;
		
		
		try {
			System.out.println(j/i);
			
			//in the try block we  write the technical code which might generate the exceptions.
			//we catch them in the catch block.
			//we can write the code we want to execute despite the conditions in try and block.
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			
			System.out.println("Code executed !");
		}
	}

}
