package multithreading;

public class ThreadIDNameDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();
        t3.setName("Third Thread");

        System.out.println("Thread 1 ID: " + t1.threadId() + " Name: " + t1.getName());
        System.out.println("Thread 2 ID: " + t2.threadId() + " Name: " + t2.getName());
        System.out.println("Thread 3 ID: " + t3.threadId() + " Name: " + t3.getName());
    }
}
