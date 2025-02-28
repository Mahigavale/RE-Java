package parent;

import java.util.HashSet;
import java.util.Set;

public class Objectdemo2 {

	public static void main(String[] args) {
		
		
		Student one =new Student(1,"Mahesh");
		Student two=new Student(1,"Mahesh");
		
		
		System.out.println(one==two);
		System.out.println(one.equals(two));
		
		
		Set<Student> set=new HashSet<>();
		
		System.out.println(set.add(one));
		System.out.println(set.add(two));
		
		for(Student st:set)
		{
			System.out.println(st);
		}
		
	
		
		
		//by default the == and .equals() check the references.
		//you can modify the .equals() according to your need.
		//you just have to maintain the contract that the .equals() if true then the hashcode must be true.
		
	}
}

class Student{
	int id;
	String name;
	
	public Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	
	public boolean equals(Object obj)
	{
		if(obj ==null )
		{
			return false;
		}
		
		if(this.getClass() != obj.getClass())
		{
			return false;
		}
		
		Student st=(Student)obj;
		
		return (this.id==st.id && this.name.equals(st.name));
			
	}
	
	
	public int hashCode()
	{
		return this.id+100;
	}
	
	
	public String toString()
	{
		return this.name+" " +this.id;
	}
	
}