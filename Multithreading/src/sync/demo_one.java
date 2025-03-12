//package sync;
//
//public class demo_one {
//
//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//		
//		
//		counter count=new counter();
//		
//		Threadable t1=new Threadable(count);
//		Threadable t2=new Threadable(count);
//		
//		Print p=new Print();
//		
//		
//		t1.start();
//		t2.start();
//		p.start();
//		
//		t1.join();
//		t2.join();
//
//		
//		System.out.println("final count :"+count.getCounter());
//	}
//
//}
//
//
//class counter{
//	
//	private int counter=0;
//	
//	
//	public  synchronized void increament()
//	{
//		counter++;
//	}
//	
//	
//	public int getCounter()
//	{
//		return counter;
//	}
//}
//
//
//class Threadable extends Thread{
//	
//	private counter count;
//	
//	
//	public Threadable(counter count)
//	{ 
//		this.count=count;
//	}
//	
//	public void run()
//	{
//		for(int i=0;i<1000000000;i++)
//		{
//			count.increament();
//		}
//		
//		
//		
//	}
//}
//
//class Print extends Thread{
//	
//	
//	public void run()
//	{
//		System.out.println("display !");
//	}
//}