package Intro_to;

public class Two {

	public static void main(String[] args) {
		
	
		Thread t=new Thread(()->
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("*");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
			
		t.start();

	}

}

//class Demo implements Runnable
//{
//
//	@Override
//	public void run() {
//		
//		for(int i=0;i<5;i++)
//		{
//			System.out.println("*");
//			
//			try {
//				Thread.sleep(1500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//	}
//	
//}