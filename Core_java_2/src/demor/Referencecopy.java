package demor;

public class Referencecopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Address add=new Address("Pune");
		
		
		Employee_lt one=new Employee_lt(1,"mahesh",add);
		
		Employee_lt two=(Employee_lt)one.clone();		
		two.id=4;
		two.name="john";
		two.add.city="Latur";
		System.out.println(one);
		System.out.println(two);
		
		//this is Reference Copy.
		//the references are copied from one class reference to another class Reference.
		// both points to same Object. Object Sharing.
		// changes  in one means changes in Other.
		
		
		//this is shallow copy 
		//meaning the primitive values are copied directly.
		//but the reference values are not copied independently.
		
		//this is deep copy
		//where the primitive as well as reference copies are copied independently.

	}

}


class Employee_lt implements Cloneable {
	
	int id;
	String name;
	
	Address add;
	public Employee_lt(int id,String name, Address add)
	{
		this.id=id;
		this.name=name;
		this.add=add;
	}

	@Override
	public String toString() {
		return "Employee_lt [id=" + id + ", name=" + name + "City ="+ add.city+"]";
	}
	
	
	public Object clone() throws CloneNotSupportedException
	{
		Employee_lt emp=(Employee_lt)super.clone();
		emp.add= new Address(add.city);
		return  emp;
	}
	
}

class Address{
	String city;
	
	public Address(String city)
	{
		this.city=city;
	}
}