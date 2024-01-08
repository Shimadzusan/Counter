public class CounterThread extends Thread implements Runnable {
    String message = "";
    int count = 0;
    public CounterThread(String message) {
        this.message = message;
    }
    @Override
    public void run() {
        // Code to be executed in the new thread
        while(true) {
            try {
                System.out.println("running a separate thread, " + message + " count = " + count);
                Thread.sleep(1000);
                count++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
