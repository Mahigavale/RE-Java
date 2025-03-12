package sync;

import java.util.ArrayList;
import java.util.List;

public class Demo_Three {

	public static void main(String[] args) throws InterruptedException {

		Arraylist_demo demo=new Arraylist_demo();

  Thread_Primo primo= new Thread_Primo(demo);
  Thread_Primo dimo= new Thread_Primo(demo);
  
  
  long start=System.nanoTime();
  
  primo.start();
  dimo.start();
 
  primo.join();
  dimo.join();
  
  System.out.println("final size :"+demo.getsize());
  
  long end=System.nanoTime();
  
  System.out.println("Total time :"+ (end-start));
  
 
		
	}

}

class Arraylist_demo{
	
	List<Integer> list =new ArrayList();
	
	
	public synchronized void addelements(int i)
	{
		list.add(i);
	}
	
	public synchronized int getsize()
	{
		return list.size();
	}
}


class Thread_Primo extends Thread{
	
	
	private Arraylist_demo demo;
	
	
	public Thread_Primo(Arraylist_demo demo)
	{
		this.demo=demo;
	}
	
	
	public void run()
	{
		for(int i=0;i<16000;i++)
		{
			demo.addelements(i);
		}
	}
}