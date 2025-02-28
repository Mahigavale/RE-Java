package arrays;

public class Demo2 {

	public static void main(String[] args) {
		
		Student st=new Student();
		
		Student st2=new Student();
		
		st.id=34;
		st.name="mahesh";
		
		st2.id=34;
		st2.name="mahesh";
		
		System.out.println(st.equals(st2));
		//reflexive
		//transitive
		//consistent
		//Symmetric
		
	}

}


class Student
{
	
	
	int id;
	String name;
	
	public String toString()
	{
		 return this.name;
	}
	
	public int hashCode()
	{
		return  this.id;
	}
	
	
	public boolean equals(Object O)
	{
		if(O==null || this.getClass() != O.getClass())
		{
			return false;
		}
		
		 Student st=(Student)O;
		 
		 if(st.id==this.id && st.name==this.name)
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
		 
	}
}
