package multithreading;

public class SharedBooleanResource {
    private volatile boolean stoFlag = false;

    public void setStoFlag() {
        stoFlag = true;
    }

    public void doWork() {
        while (!stoFlag) {
            System.out.println("Working");
        }
        System.out.println("Done");
    }
}
