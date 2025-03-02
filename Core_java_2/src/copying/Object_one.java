package copying;




import java.util.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class Object_one {

	public static void main(String[] args) {
		
		Player one =new Player(1,"SRT");
		Player two=new Player(1,"SRT");
		
		System.out.println(one.equals(two));

		System.out.println(one.hashCode());
		System.out.println(two.hashCode());
		
		
		Set<Player> set=new HashSet();
		
		set.add(one);
		set.add(two);
		
		for(Player p:set)
		{
			
		}
		
		
		
	}

}

class Player{
	
	int id;
	String name;
	
	
	public Player(int id, String name)
	{
		 this.id=id;
		 this.name=name;
	}
	
	
	
	public int hashCode()
	{
		return 1000+this.id;
	}
	
	
	
	public boolean equals(Object obj)
	{
		if(obj.getClass() ==null)
		{
			return false;
		}
		
		if(this.getClass() != obj.getClass() )
		{
			return false;
		}
		
		Player p=(Player)obj;
		return (this.id==p.id && this.name.equals(p.name));
		
	}
	
	
}
