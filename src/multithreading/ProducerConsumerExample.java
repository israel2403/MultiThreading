package multithreading;

public class ProducerConsumerExample {

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread producer = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                sharedResource.produce(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        producer.start();
        Thread consumer = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                sharedResource.consume();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        consumer.start();
    }

}