package demor;

public class Demo_info {

	public static void main(String[] args) {
		
		Acc ac=new Acc();
		
		ac.id=34;
		ac.name="demo";
		
		ac.show();

	}

}

class Acc
{
	int id;
	String name;
	
	public void show()
	{
		System.out.println(this.id);
		System.out.println(this.name);
	}
	
	
}