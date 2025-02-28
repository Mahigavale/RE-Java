package demor;

public class Copy2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Address1 add=new Address1("Pune");
		Student one =new Student(1,"Mahesh", add);
		
		Student two=(Student)one.clone();
		
		two.id=2;
		two.name="Pooja";
		two.add.city="Latur";
		
		System.out.println(one);
		
		System.out.println(two);
		
		
	}

}


//Reference Copy: where only a single Object is shared across and changes in one 
// Object are reflected into another.
//because they refer to the same reference.


//Shallow Copy: where the Object are  cloned
// but remember only the primitive types are cloned and not the reference types.
//for reference types you will have to implement the deep copy.


class Student implements Cloneable{
	int id;
	String name;
	Address1 add;
	
	public Student(int id,String name, Address1 add)
	{
		this.id=id;
		this.name=name;
		this.add=add;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name+"  City="+add.city + "]";
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		Student st=(Student) super.clone();
		st.add= new Address1(add.city);
		
		return st;
	}
	
	
}




class Address1
{
	String city;
	
	
	public Address1(String city)
	{
	    this.city=city;	
	}
}