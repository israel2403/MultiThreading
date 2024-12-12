package multithreading;

public class SleepDemo {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from main method");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by main method is: " + (endTime - startTime));
    }
}
