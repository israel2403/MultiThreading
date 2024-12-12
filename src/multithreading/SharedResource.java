package multithreading;

public class SharedResource {

    private int data;

    private boolean isEmpty = true;

    public synchronized int produce(int value) {
        while (!isEmpty) {
            try {
                // Buffer is not empty, wait for consumer to consume
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Produce an item
        data = value;
        isEmpty = false;
        System.out.println("Produced: " + value);

        // Notify the waiting consumer
        notify();
        return data;
    }

    // consumer method
    public synchronized int consume() {
        while (isEmpty) {
            try {
                // Buffer is empty, wait for producer to produce
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Consume the item
        int consumedData = data;
        isEmpty = true;
        System.out.println("Consumed: " + consumedData);

        // Notify the waiting producer
        notify();
        return consumedData;
    }
}