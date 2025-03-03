package Intro_to;

public class First {

	public static void main(String[] args) throws InterruptedException {

		
		for(int i=0;i<5;i++)
		{
			System.out.println("*");
			Thread.sleep(1500);
		}
		
		Numbers num=new Numbers();
		Characters Char=new Characters();
		Print prt=new Print();
		
		//Long start=System.nanoTime();
		num.start();
		//num.join();
		System.out.println(num.isAlive());
		//num.join();
		Char.start();
		//Char.join();
		prt.start();
		//Long end=System.nanoTime();
		
		//System.out.println("Time :"+(end-start));
		

	}

}

class Numbers  extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i +"from thread numbers");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		}
		System.out.println("thread executed ");
	}
}

class Characters  extends Thread {

	public void run() {
		for (char c = 'a'; c < 'g'; c++) {
			System.out.println(c + "from thread characters");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

class Print  extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Keep pushing !" +"from last");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}