package multithreading;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        System.out.println("Current Thread ID: " + currentThread.threadId());
        System.out.println("Current Thread Name: " + currentThread.getName());
    }
}
