package multithreading;

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PriorityExample("Thread A"));
        Thread t2 = new Thread(new PriorityExample("Thread B"));
        Thread t3 = new Thread(new PriorityExample("Thread C"));
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
