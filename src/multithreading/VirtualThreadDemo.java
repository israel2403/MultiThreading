package multithreading;

import java.util.Random;

// with normal thread it will take 82828 ms
// with virtual thread it will take 24662 ms
// 82828 - 24662 = 58166 ms of difference
public class VirtualThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        Random random = new Random();
        Runnable runnable = () -> {
            double result = random.nextDouble(1000) * random.nextDouble(1000);
            System.out.println(result);
        };

        for (int i = 0; i < 500000; i++) {
            Thread.ofVirtual().start(runnable).join();
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken by virtual thread is: " + (end - start));
    }
}
