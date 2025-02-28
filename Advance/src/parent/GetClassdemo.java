package parent;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GetClassdemo {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
		
		
		Employee e=new Employee();
		
		Class<?> cl=e.getClass();
		
		System.out.println(cl.getPackageName());
		
		System.out.println(cl.getName());
		
		//to access the fields
		
		System.out.println("to access the Fields in the given class.....");
		for(Field field:cl.getDeclaredFields())	
		{
			System.out.println(field.getName());
			
		}
		
		System.out.println("to access the methods .........................:");
		
		for(Method method:cl.getDeclaredMethods())
		{
			
			System.out.println(method.getName());
			System.out.println(method.getModifiers());
		}
		
		
		System.out.println("to access the constructors ...........................:");
		
		for(Constructor<?> c:cl.getDeclaredConstructors())
		{
			System.out.println(c);
		}
		
		
		Field field=cl.getDeclaredField("company");
		
		field.setAccessible(true);
		
		 String secure=(String) field.get(e);
		 
		 System.out.println("Not So secure :"+secure);
		 
		 Method method=cl.getDeclaredMethod("demo", null);
		 method.setAccessible(true);

		 method.invoke(e);
		
		

	}

}

class Employee
{
	int id;
	private String company="HCL";
	
	public void Show()
	{
		System.out.println("show from the employee !");
	}
	
	
	public void Run()
	{
		System.out.println("run from the Employee !");
	}
	
	private void demo()
	{
		System.out.println("demo private method for the  demo!");
	}
	
	
	
	private Employee(int i)
	{
		System.out.println("private constructor");
	}
	
	public Employee()
	{
		
	}
}
