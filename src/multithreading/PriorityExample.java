
package multithreading;

public class PriorityExample implements Runnable {

    private final String name;

    public PriorityExample(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " - Count: " + i + " Priority: " + Thread.currentThread().getPriority());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}