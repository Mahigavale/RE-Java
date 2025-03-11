package synchronization;

import java.util.ArrayList;

public class Fifth {

	public static void main(String[] args) {
		shared_two two=new shared_two();
		
		Produce pro=new Produce(two);
		
		Consume cons=new Consume(two);
		
		pro.start();
		cons.start();
		
	}

}

class shared_two{
	
	ArrayList<Integer> list=new ArrayList<Integer>();
	int count=1;
	
	
	public synchronized void  produce() throws InterruptedException
	{
		
		if(list.size()>=10)
		{
			System.out.println("size is full.....waiting for consumer to consume something");
			wait();
		}
		
		list.add(count++);
		System.out.println("notifying.....consumer::added"+count);
		notify();
		
	}
	
	public synchronized void consume() throws InterruptedException
	{
		if(list.isEmpty())
		{
			System.out.println("waiting.....");
			wait();
		}
		
		int i=list.remove(0);
		
		System.out.println("consumed :::"+ i);
		System.out.println("notifying....Producer..consumed"+i);
		notify();
	}
}



class Produce extends Thread{
	
	private shared_two two;
	
	public Produce(shared_two two)
	{
		this.two=two;
	}
	
	public void run()
	{
		while(true)
		{
			try {
				two.produce();
				
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
class Consume extends Thread{
	
	private shared_two two;
	
	
	public Consume(shared_two two)
	{
		this.two=two;
	}
	
	public void run()
	{
		while(true)
		{
			try {
				two.consume();
				
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}