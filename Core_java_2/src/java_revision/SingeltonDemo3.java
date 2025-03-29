package java_revision;

public class SingeltonDemo3 {

	public static void main(String[] args) {
		
		Student st=Student.getInst();
		
		Student st2=Student.getInst();
		
		Student st3=Student.getInst();
		
		
		System.out.println(st.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st3.hashCode());
		

	}

}


class Student{
	
	private static Student st=null;
	
	
	public String s;
	
	
	
	private Student()
	{
		s="hello brother";
		
		System.out.println(s);
	}
	
	public static synchronized  Student getInst()
	{
		if(st==null)
			st=new Student();
		
		return st;
	}
}