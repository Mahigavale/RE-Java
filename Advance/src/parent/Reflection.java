package parent;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
		Leader L=new Leader();
		
	   Class<?>  clas=L.getClass();
	   
	   System.out.println(clas.getName());
	   
	   
	   //To access all the methods in the class.
	   for(Method method:clas.getDeclaredMethods())  
	   {
		    System.out.println("method name:"+method.getName());
		    System.out.println("method paramters:"+method.getParameterCount());
		    System.out.println("Method access modifier:"+method.getModifiers());
		    System.out.println("###################################################");
		   
	   }
	   
	   System.out.println("**************************************************************");
	   //to access the fields in the class.
	   System.out.println("fields :");
	   
	   for(Field field:clas.getDeclaredFields())
	   {
		 System.out.println(field);   
	   }

	   System.out.println("****************************************************************");
	   
	   //To access a private field in the class.
	   Field field=clas.getDeclaredField("leader_mobile");
	   
	   field.setAccessible(true);
	   
	   String secured=(String)field.get(L);
	   
	   
	   System.out.println("Not so:"+secured);
	   
	   System.out.println("******************************************");

	   
	   //to access the another private field in the class.
	   
	   Field f2=clas.getDeclaredField("Leader_home");
	   
	   f2.setAccessible(true);
	   
	   String home=(String)f2.get(L);
	   System.out.println("Home :"+home);
	   
	   
	   //To access and invoke the private methods in the class with params.
	   
	   
	   Method m2=clas.getDeclaredMethod("demo",int.class,int.class);
	   ///reflection api identifies int.class as well as Integer.class.
	   m2.setAccessible(true);
	  
	   System.out.println("************************");
	   m2.invoke(L,10,10);
	   
	   
	}

}


class Leader extends Object{
	int leader_id;
	private String leader_mobile="7774834341";
	
	private String  Leader_home="Pune";
	
	int leader_name;
	
	public Leader()
	{
		
	}
	
	private Leader(int i)
	{
		
	}
	
	public void show(int i)
	{
		System.out.println("Public :Show");
	}
	
	private void address()
	
	{
		System.out.println("Address:");
	}
	
	
	
	
	private void demo(int i,int j)
	{
		System.out.println("the private method with params :"+(i+j));
	}
	
}
