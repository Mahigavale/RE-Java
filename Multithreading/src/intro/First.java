package intro;

public class First {

	public static void main(String[] args) throws InterruptedException {
		
		PrintNumbers numbers=new PrintNumbers();
		
		PrintCharacters characters=new PrintCharacters();
		
		PrintMessages messages=new PrintMessages();
		numbers.start();
		System.out.println(numbers.isAlive());
		numbers.join();
		characters.start();
		characters.join();
		messages.start();
		messages.join();
		
	}
}


  class PrintNumbers extends Thread {
	
	public void run()
	{
		{
			for(int i=0;i<10;i++)
			{
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Numbers :Method Finished !");
		
		}
	}
	
	
}

class PrintCharacters extends Thread{
	
	
	public void run()
	{
		{
			for(char a='a' ; a<'g';a++)
			{
				System.out.println(a);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
			}
			}
			System.out.println("Charcter : Method Finished !");
		}
		
	
}
}

class PrintMessages extends Thread{
	
	public void run()
	{
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
			System.out.println("Motivational :method Finished !");
		}
		
	}}
	
