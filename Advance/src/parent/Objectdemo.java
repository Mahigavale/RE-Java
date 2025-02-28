package parent;

import java.util.HashSet;
import java.util.Set;

public class Objectdemo {

	public static void main(String[] args) {
		
		
		//by default the .equals and == checks the memory  references for the Objects.
		//you can override the .equals in conjuction with the .hashcode() to maintain the contract between them.
		//contract is that if the both Objects are equal then they must share the same hashcode in the same bucket in collection framework.
		
		
	  Demo d1=new Demo(1,"Demo_One");
	  Demo d2=new Demo(1,"Demo_One");
	  
	  Set<Demo> set=new HashSet<Demo>();
	  
	  
	  System.out.println(d1.hashCode());
	  System.out.println(d1.hashCode());
	  System.out.println(set.add(d1));
	 System.out.println(set.add(d2));
	 
	 for(Demo d:set)
	 {
		 System.out.println(d);
		 System.out.println("***********");
	 }
	  
	  System.out.println(d1==d2);
	  
	  System.out.println(d1.equals(d2));
	}

}

class Demo extends Object
{
	int id;
	String name;
	
	
	public Demo(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	
	
	public boolean equals(Object obj)
	{
		if(this==obj)
			
		{
			return true;
		}
		
		if(obj==null || this.getClass()!=obj.getClass() )
		{
			return false;
		}
		
		Demo d=(Demo)obj;
		
		return (this.id==d.id &&  this.name.equals(d.name));
		
	}
	
	
	public int hashCode()
	{
		return this.id+100;
	}
	
	
	public String toString()
	{
		return this.name;
	}
}
