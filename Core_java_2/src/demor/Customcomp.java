package demor;

import java.util.Comparator;
import java.util.TreeSet;

public class Customcomp {

	public static void main(String[] args) {
		
		
		TreeSet<Employee> set=new TreeSet<>(new Comparator<Employee>() {
			
			public int compare(Employee o1, Employee o2)
			{
				return o1.name.compareTo(o2.name);
			}
		}
		);
		
		set.add(new Employee(23,"mahesh",678.78));
		
		set.add(new Employee (64,"dada", 500));
		
		set.add(new Employee(55,"mama", 475));
		
		
		
		for(Employee e:set)
		{
			System.out.println(e);
		}
		
	}

}



class Employee
{
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}


class Employee_Comparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		//return Double.compare(o2.salary, o1.salary); descending
		
		return o1.name.compareTo(o2.name);
		//0=> 01==02
		//-1 01<02
		// 1 01>02
	}
	
}