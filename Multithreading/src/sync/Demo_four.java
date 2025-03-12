package sync;

public class Demo_four {

	public static void main(String[] args) throws InterruptedException {
		
		
		Bankaccount account =new Bankaccount();
		
	 T34 T=new T34(account,900);
	 T34 t2=new T34(account ,500);
	 
	 T.start();
	 t2.start();
	 T.join();
	 t2.join();
	}

}


class Bankaccount
{
	private int balance=1000;
	
	
	public synchronized void withdraw(int i)
	{
		if(i<balance)
		{
			System.out.println("withrawing :"+(i));
			balance=balance-i;
		}
		else if(i>balance)
		{
			System.out.println("insufficeint balance");
		}
		
		System.out.println("current balance :"+balance);
	}
}



class T34 extends Thread{
	
	
	
	private Bankaccount account;
	
	public int withd;
	
	
	
	public T34(Bankaccount account, int withd)
	{
		this.account=account;
		this.withd=withd;
	}
	
	
	public void run()
	{
	//	System.out.println(this.threadId()+"Withdrawing :");
		account.withdraw(withd);
		
	}
}
