package synchronization;

import java.util.ArrayList;
import java.util.List;

public class Sixth {

	public static void main(String[] args) {
		
		User user=new User(1,"mg","it","pune");
		
		Resource rs=new Resource(user);
		
		Produce_1 prod=new Produce_1(rs);
		
		Consume_1 cons=new Consume_1(rs);

	}

}

class User{
	int id;
	String name;
	String dept;
	String city;
	public User(int id, String name, String dept, String city) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.city = city;
	}
	
}

class Resource{
	
	
	public Resource(User user)
	{
		this.user=user;
	}
	private User user;
	List<User> list=new ArrayList<User>();
	
	
	
	public synchronized  void addUser(User user) throws InterruptedException
	{
		if(list.size()>=10)
		{
			System.out.println("Please consume the users....waiting");
			wait();
		}
		
		list.add(user);
		
		System.out.println("added user..."+user.name);
		System.out.println("notifying consumer......");
		notify();
	}
	
	
	public synchronized void removeuser()
	{
		if(list.isEmpty())
		{
			System.out.println("waiting.....");
		}
		
		User user=list.remove(0);
		
		System.out.println("user removed..."+user.name);
		System.out.println("notifying consumer....");
		notify();
	}
}



class Produce_1 extends Thread{
	
	private User user;
	private Resource resource;
	
	public Produce_1(Resource resource)
	{
		this.resource=resource;
	}
	
	
	public void run()
	{
		try {
			resource.addUser(user);
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Consume_1 extends Thread{
	
	//private User user;
	private Resource resource;
	
	public Consume_1(Resource resource) {
		this.resource=resource;
	}
	
	
	public void run()
	{
		try {
			resource.removeuser();
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
