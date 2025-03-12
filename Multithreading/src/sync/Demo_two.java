package sync;

public class Demo_two {

	public static void main(String[] args) throws InterruptedException {
		
		
		CounteR counter=new CounteR();
		
		
		Thread_One One=new Thread_One(counter);
		
		Thread_One Two=new Thread_One(counter);
		
		One.start();
		Two.start();
		One.join();
		Two.join();
		
		
		System.out.println("Final Count :"+counter.getCounter());
		

	}

}


class CounteR{
	
	private int counter=0;
	
	
	
	
	public synchronized  void Increament()
	{
		counter++;
	}
	
	
	
	public int getCounter()
	{
		return counter;
	}
}

class Thread_One extends Thread{
	
	private CounteR counter;
	
	public Thread_One(CounteR counter)
	{
		this.counter=counter;
	}
	
	
	public void run()
	{
	
		for(int i=0;i<5000;i++)
		{
			counter.Increament();
		}
	}
}