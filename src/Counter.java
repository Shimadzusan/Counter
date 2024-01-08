import java.util.Random;

public class Counter {
    public static void main(String[] args) throws InterruptedException {
        Random rn = new Random();
        for (int i = 0; i < 1000; i++) {
            CounterThread ct = new CounterThread("" + i);
            ct.start();
            Thread.sleep(rn.nextInt(2000));
        }

        for (int i = 0; i < 600000; i++) {
            Thread.sleep(1000);
            System.out.println("count: " + i);
        }
    }
}
