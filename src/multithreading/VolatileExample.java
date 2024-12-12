package multithreading;

public class VolatileExample {
    public static void main(String[] args) throws InterruptedException {
        SharedBooleanResource sharedBooleanResource = new SharedBooleanResource();
        Thread workerThread = new Thread(() -> sharedBooleanResource.doWork());

        Thread stopperThread = new Thread(() -> {
            try {
                Thread.sleep(3000);
                sharedBooleanResource.setStoFlag();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        workerThread.start();
        stopperThread.start();
        stopperThread.join();
    }
}
