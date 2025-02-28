package arrays;

public class Demo {

	public static void main(String[] args) {
		
		
		Shared one =new Shared();
		
		Shared two=new Shared();
		
		one.name="Mahesh";
		
		two.name="Mahesh";
		one.id=23;
		two.id=23;
		
		System.out.println(one);
		System.out.println(two);
		
		System.out.println(one==two);
		
		System.out.println(one.equals(two));
		

	}

}


class Shared
{
	
	int id;
	String name;
	String city;
	
	
	public  String toString()
	{
		return this.name;
	}
	
	public int  hashCode()
	{
		return id;
	}
	
	public boolean equals(Object Obj)
	{
	 if(Obj==null || Obj.getClass() !=this.getClass())
	 {
		 return false;
	 }
	 
	  Shared sh=(Shared)Obj ;
	  
	  
			  if(sh.id==this.id)
				  return true;
			  else
			  {
				  return false;
			  }
			 
	}
	
}
