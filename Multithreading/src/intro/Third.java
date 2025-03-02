package intro;

public class Third {

	public static void main(String[] args) {
		
		One_d one=new One_d();
		Thread t=new Thread(one,"USer!");
		
		t.start();
		System.out.println(t.getName());
		
	}

}

class One_d implements Runnable{

	@Override
	public void run() {
		
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
		
	}
	
}