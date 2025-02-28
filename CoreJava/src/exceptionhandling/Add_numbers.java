package exceptionhandling;

public class Add_numbers {

	public static void main(String[] args) {
 
		Two T_one=new Two();
		
	
		try
		{
			T_one.i=100;
			T_one.j=200;
			
			if(T_one.i>=90 || T_one.j >=90)
			{
				throw new Higher_number_exception("The number can't be higher than the 100");
			}
			else
			{
				System.out.println("The code executed without the exception !");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			
			System.out.println("The code Executed !");
		}
		
	}
}


class Two {
	
	int i;
	int j;
	
	public void Add_two(int i,int j)
	{
		System.out.println(i+j);
	}
	
	
}