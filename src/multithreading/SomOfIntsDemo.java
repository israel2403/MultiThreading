
package multithreading;

public class SomOfIntsDemo {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long result = 0;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result);
        System.out.println("Time taken: " + (end - start));
    }
}