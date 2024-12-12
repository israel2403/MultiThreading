package multithreading;

public class Counter {

    private int count;

    public void incrementUnSynchronized() {
        count++;
    }

    public  void incrementSynchronized() {
        synchronized (Counter.class) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}
