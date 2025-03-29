package java_revision;

public class Singleton2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee x=Employee.getobj();
		
		Employee y=Employee.getobj();
		
		System.out.println(x.hashCode());
		System.out.println(y.hashCode());

	}

}


class Employee{
	
	private static Employee emp=null;
	
	private Employee()
	{
		System.out.println("hdufeije");
	}
	
	public static synchronized Employee getobj()
	{
		if(emp==null)
			emp=new Employee();
		return emp;
	}
}