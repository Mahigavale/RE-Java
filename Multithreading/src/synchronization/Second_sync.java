package synchronization;

public class Second_sync {

	public static void main(String[] args) throws InterruptedException {
		Bankaccount chetan=new Bankaccount();
		
		Phonepe one =new Phonepe(chetan, 6000);
		Phonepe second=new Phonepe(chetan, 8999);
		Phonepe third=new Phonepe(chetan,20000);
//	
//	third.setPriority(10);
//		second.setPriority(7);
//		one.setPriority(2);
//		
		
		
		/**
		 * documentation comment
		 */
		
		
		one.start();
		second.start();
		third.start();
		one.join();
		second.join();
		third.join();

	}

}

class Bankaccount {

	private int balance = 15000;

	public synchronized  void withdraw(int amount) {
		    if(amount<balance)
		    {
		    System.out.println("Withdrawing cash :::" + amount);
			System.out.println("withdrawl successfull...");
			System.out.println("updating balance.....");
			balance = balance - amount;
			System.out.println("remaining balance:" + balance);
		    }
		if(amount>balance)
		{
			System.out.println("withdrawing :"+amount);
			System.out.println("Insuffiecinet !");
			
		}

			
			
	}

}

class Phonepe extends Thread{
	
	private Bankaccount account;
	 private int amount;
	 
	
	
	public  Phonepe(Bankaccount account, int amount)
	{
		this.account=account;
		this.amount=amount;
		
	}
	
	public void run()
	{
	  account.withdraw(amount);	
	}
	

}