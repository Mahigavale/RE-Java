package demor;

public class Throws_demo {

	public static void main(String[] args) {
		
		Throwre re=new Throwre();

		try {
			
		re.addnums(123,234);
		}
		catch(Customexception c)
		{
			System.out.println(c.getMessage());
		}
		finally {
			
		}
	}

}

class Throwre
{
	public void addnums(int i, int j) throws  Customexception
	{
		System.out.println(i+j);
	}
}

class Customexception extends Exception
{
	
	public Customexception()
	{
		super("custom exception hits here !");
	}
}