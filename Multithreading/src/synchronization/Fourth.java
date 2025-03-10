package synchronization;

import java.util.ArrayList;
import java.util.List;

public class Fourth {

	public static void main(String[] args) {

		Shared_list shared = new Shared_list();

		Producer_List list_produce = new Producer_List(shared);

		Consumer_List list_consume = new Consumer_List(shared);
		Consumer_List list_consume2 = new Consumer_List(shared);

		
		

		list_produce.start();

		list_consume.start();
		
		list_consume2.start();

	}

}

class Shared_list {

	List<Integer> list = new ArrayList<Integer>();

	int Capacity = 10;
	int val = 1;

	public synchronized void produce() throws InterruptedException {

		while (list.size() == 10) {
			System.out.println("My list is fulll... please consume something!");
			System.out.println("waiting.........");
			wait();
		}
		list.add(val);
		System.out.println("value added :" + (val));
		++val;
		System.out.println("notifying........consumer");
		notifyAll();

	}

	public synchronized void consume() throws InterruptedException {
		while (list.size() == 0) {
			System.out.println("List is empty....I am waiting ...");
			wait();
		}

		int consumed_element = list.remove(0);
		System.out.println("COnsumed spmething:" + consumed_element);
		System.out.println("Notifying.... Producer");
		notifyAll();
	}

}

class Producer_List extends Thread {

	private Shared_list shared;

	public Producer_List(Shared_list shared) {
		this.shared = shared;
	}

	public void run() {
		while(true) {
		try {
			shared.produce();
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
	}
}

class Consumer_List extends Thread {

	private Shared_list shared;

	public Consumer_List(Shared_list shared) {
		this.shared = shared;
	}

	public void run() {
		while(true) {
		try {
			shared.consume();

			System.out.println("Consumed by Thread:"+ Thread.currentThread().getName());
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
	}

}
