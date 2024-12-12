package multithreading;

public class UnSynchronizationExample {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable unSynchronizedTask = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.incrementUnSynchronized();
            }
        };
        Thread thread1 = new Thread(unSynchronizedTask);
        Thread thread2 = new Thread(unSynchronizedTask);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Unsynchronized count value: " + counter.getCount());
    }
}
