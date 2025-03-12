//package sync;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Fourth_sync {
//    public static void main(String[] args) {
//        Shared shared = new Shared();
//        Producer producer = new Producer(shared);
//        Consumer consumer = new Consumer(shared);
//
//        producer.start();
//        consumer.start();
//    }
//}
//
//class Shared {
//    private final List<Integer> list = new ArrayList<>();
//    private final int CAPACITY = 10;
//    private int value = 1;
//
//    public synchronized void produce() throws InterruptedException {
//        while (list.size() == CAPACITY) {
//            System.out.println("Producer waiting: List is full");
//            wait(); // Wait if buffer is full
//        }
//
//        list.add(value++);
//        System.out.println("Produced: " + (value - 1));
//
//        notify(); // Notify consumer that an item is available
//    }
//
//    public synchronized void consume() throws InterruptedException {
//        while (list.isEmpty()) {
//            System.out.println("Consumer waiting: List is empty");
//            wait(); // Wait if buffer is empty
//        }
//
//        int consumedValue = list.remove(0);
//        System.out.println("Consumed: " + consumedValue);
//
//        notify(); // Notify producer that space is available
//    }
//}
//
//class Producer extends Thread {
//    private final Shared shared;
//
//    public Producer(Shared shared) {
//        this.shared = shared;
//    }
//
//    public void run() {
//        while (true) {
//            try {
//                shared.produce();
//                Thread.sleep(500); // Sleep outside synchronized block
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//
//class Consumer extends Thread {
//    private final Shared shared;
//
//    public Consumer(Shared shared) {
//        this.shared = shared;
//    }
//
//    public void run() {
//        while (true) {
//            try {
//                shared.consume();
//                Thread.sleep(100); // Sleep outside synchronized block
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
