package Misc2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comp {

	public static void main(String[] args) {
		
		List<Student2> dscl=new ArrayList<Student2>();
		
		
		dscl.add(new Student2(1,"mahesh"));
		dscl.add(new Student2(4,"dada"));
		dscl.add(new Student2(2,"pritam"));
		
		
		//Collections.sort(dscl);
		
		
//		for(Student s:dscl)
//		{
//			System.out.println(s.id);
//		}
		
		Collections.sort(dscl, (s1,s2)->((s1.name).compareTo(s2.name)));
		
		for(Student2 s:dscl)
		{
			System.out.println(s.name);
		}
		
	

	}

}


class Student implements Comparable<Student>{
	
	int id;
	String name;
	
	
	public Student(int id, String name)
	{
		this.id=id;
		this.name=name;
	}


	@Override
	public int compareTo(Student o) {
		
		return this.id-o.id;
	}
}


class Student2 implements Comparator<Student>
{
	int id;
	String name;
	
	
	public Student2(int id,String name)
	{
		this.id=id;
		this.name=name;
	}


	@Override
	public int compare(Student o1, Student o2) {
		if(o1.id<o2.id)
		{
			return 1;
		}
		if(o1.id>o2.id)
		{
			return -1;
		}
		return 0;
	}
}