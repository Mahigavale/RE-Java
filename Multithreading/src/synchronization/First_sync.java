package synchronization;

public class First_sync {

	public static void main(String[] args) throws InterruptedException {
		

		Counter count =new Counter();
		
		Thread_First first=new Thread_First(count);
		Thread_First second=new Thread_First(count);
		Thread_First third=new Thread_First(count);
		
		
		first.start();
		first.join();
		second.start();
		third.start();
		first.join();
		second.join();
		third.join();
		
		System.out.println(count.Getcount());
	}

}

class Counter{
	
	private int count=0;
	//instance variable
	
	
	
	public  void Increament()
	{
		count++;
	}
	
	public int Getcount() {
		return count;
	}
	
}

class Thread_First extends Thread{
	
	
	private  Counter count;
	
	//reference of the class. Shared Resource.
	
	public void run()
	{
		
		for(int i=0;i<15000;i++)
		{
			count.Increament();
		}
	}
	
	
	public Thread_First(Counter count)
	{
		this.count=count;
	}
	
}