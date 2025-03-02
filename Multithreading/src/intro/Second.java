package intro;

public class Second {

	public static void main(String[] args) throws InterruptedException {
		
		Numbers N=new Numbers();
		Characters C=new Characters();
		Motivation M=new Motivation();
		
		long start=System.nanoTime();
		N.start();
		//N.join();
		C.start();
		//C.join();
		M.start();
		//M.join();
		long end=System.nanoTime();
		
		
		System.out.println("****************************************");
		System.out.println("time to execute :"+(end-start));

	}

}

class Numbers extends Thread
{
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Numbers Method finished :");
	}

	
}
class Characters extends Thread{
	
	public void run() {
	for(char c='a';c<'g';c++)
	{
		System.out.println(c);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	System.out.println("Charcter method finished :");
	}
	
}
class Motivation extends Thread{
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("keep pushing hard !");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Motivation method finished :");
	}
	
}