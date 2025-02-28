package copying;

public class Referencecopy {

	public static void main(String[] args) {
		
		Player Sachin=new Player(1,"Tendulkar", "Mumbai");
		
		
		Player Dhoni=Sachin;
		
		Dhoni.id=2;
		
		System.out.println("Dhoni ID;"+Dhoni.id);
         System.out.println("Sachin id :"+Sachin.id);		
	}

}

class Player
{
	int id;
	String name;
	String City;
	
	public Player(int id,String name,String city)
	{
		this.id=id;
		this.name=name;
		this.City=City;
	}
	
}
