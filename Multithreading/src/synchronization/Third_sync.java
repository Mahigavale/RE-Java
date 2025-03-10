package synchronization;

import java.util.ArrayList;
import java.util.List;

public class Third_sync {

	public static void main(String[] args) {
		
Shared shared=new Shared();

Producer produce=new Producer(shared);
Consumer consume=new Consumer(shared);

produce.start();
consume.start();
	}

}


class Shared{
	
	List<Integer> list=new ArrayList<Integer>();
	
	int capacity=5;
	
	int value=1;
	
	public synchronized void produce(int value) throws InterruptedException
	{
		while(list.size()==capacity)
		{
			System.out.println("size is full..waiting..Please consume first to proceed !!!");
			wait();
		}
		
		
		list.add(value);
		System.out.println("Produced value :"+ value);
		System.out.println("notifying the consumer....");
		notify();
	}
	
	public synchronized void consume() throws InterruptedException
	{
		while(list.size()==0)
		{
			System.out.println("Consumer is empty....waiting for producer to produce..");
			wait();
		}
			
		
		int value=list.remove(0);
		
		System.out.println("Value consumed..."+value);
		System.out.println("notifying the producer to produce the more values....");
		notify();
		
	}
	
}


class Producer extends Thread{
	
	private Shared shared;
	
	
	public Producer(Shared shared)
	{
		this.shared=shared;
	}
	
	
	public void run()
	{
		int value=1;
		
		while(true)
		{
			try {
				shared.produce(value++);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


class Consumer extends Thread{
	
	private Shared shared;
	
	public Consumer(Shared shared)
	{
		this.shared=shared;
	}
	
	
	
	public void run()
	{
		try {
			shared.consume();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try {
//			Thread.sleep(800);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}