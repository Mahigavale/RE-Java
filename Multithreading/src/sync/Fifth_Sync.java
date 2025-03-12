//package sync;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Fifth_Sync {
//
//	public static void main(String[] args) {
//		
//Shared1 shared=new Shared1();
//
//Producer1 prod=new Producer1(shared);
//
//Consumer1 cons=new Consumer1(shared);
//
//Consumer1 cons2=new Consumer1(shared);
//
//Consumer1 cons3=new Consumer1(shared);
//
//prod.start();
//cons.start();
//cons2.start();
//cons3.start();
//	}
//
//}
//
//
//class Shared1{
//	
//	int cap=10;
//	
//	int value=0;
//	List<Integer> list=new ArrayList<Integer>();
//	
//	
//	public synchronized void produce() throws InterruptedException
//	{
//		while(list.size()==cap)
//		{
//			System.out.println("The List is full... waiting for consumer to consume");
//			wait();
//		}
//		
//		list.add(++value);
//		System.out.println("Produced:"+(value));
//		System.out.println("Notifying all consumers...");
//		notifyAll();
//	}
//	
//	public synchronized void consume() throws InterruptedException
//	{
//		while(list.size()==0)
//		{
//			System.out.println("List is consumed.. waiting for producer to produce..");
//			wait();
//		}
//		
//		int value=list.remove(0);
//		System.out.println("Value consumed:"+value +"by :"+Thread.currentThread().getName());
//		System.out.println("notifying  All producer....");
//		notifyAll();
//	}
//}
//
//
//class Producer1 extends Thread {
//	
//	private Shared1 shared;
//	
//	public Producer1(Shared1 shared)
//	{
//		this.shared=shared;
//	}
//	
//	
//	
//	
//	public void run()
//	{
//		
//		while(true) {
//		try {
//			shared.produce();
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	}
//}
//
//class Consumer1 extends Thread {
//	
//	private Shared1 shared;
//	
//	public Consumer1(Shared1 shared)
//	{
//		this.shared=shared;
//	}
//	
//	
//	
//	
//	public void run()
//	{
//		while(true) {
//		try {
//			shared.consume();
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		}
//	}
//}