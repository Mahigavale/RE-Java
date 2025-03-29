package Misc2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Stream {
	
	public static void main(String args[])
	{
		
		
		String name="Mahesh Gavale";
		
		char[] c=new char[name.length()];
		
		
		for(int i=0;i<name.length();i++)
		{
			c[i]=name.charAt(i);
		}
		
//		

		
		
		
		List<Integer> numbers=Arrays.asList(10,11,12,13,14,15,17,16,13);
		
		long count= numbers.stream().filter(n-> n%2==0).count();
		
		System.out.println(count);
		
		Predicate<Integer> P= n-> n>14;
		
		List<Integer> even=numbers.stream().filter(P).collect(Collectors.toList());
		
		System.out.println(even);
		
		Consumer cl= n-> System.out.println(n);
		
		  numbers.stream().map(n-> n*2).forEach(cl);
		  
		 
		
		
		  
		  //Predicate => take values and return boolean values.(Filter)
		  //Consumer => Only to Print the values.(Foreach)
		
		
//		List<Integer> numbers=Arrays.asList(10,11,12,13,11,17);
//		
//		List<Integer> filtered_numbers=numbers.stream().map(n->n*2).distinct().collect(Collectors.toList());
//		
//		long count=numbers.stream().filter(n->n>10).count();
//		
//		
//		filtered_numbers.stream().forEach(n->System.out.println(n));
//		
//		System.out.println(count);
//		
//		
//		Predicate<Integer> iseven= n-> (n%2==0) ;
//		
//		
//		List<Integer> even=numbers.stream().filter(iseven).collect(Collectors.toList());
//		
//		Consumer<Integer> print= n-> System.out.println(n);
//		
//		
//		System.out.println("printing even....");
//		
//		even.stream().forEach(print);
//		
//		
//	
//		Predicate<Employee> checksal=emp->emp.getSalary()>=5000;
//		
//		Consumer<Employee> printinfo=emp-> System.out.println(emp.getSalary()) ;
//		
//		
//		List<Employee> comp=Arrays.asList(new Employee(1,"M",3000),new Employee(2,"A",2000),new Employee(3,"B",5000));
//		
//		
//		List<Employee> emp=comp.stream().filter(checksal).collect(Collectors.toList());
//		
//		System.out.println("*********Salaried People*************");
//		emp.stream().forEach(printinfo);
		
	}
}


//class Employee{
//	int id;
//	String name;
//	
//	long salary;
//	
//	public Employee(int id, String name, long salary)
//	{
//	 this.id=id;
//	 this.name=name;
//	 this.salary=salary;
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public long getSalary() {
//		return salary;
//	}
//	public void setSalary(long salary) {
//		this.salary = salary;
//	}
//}