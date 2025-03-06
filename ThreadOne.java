
public class ThreadOne extends Thread {
    @Override
    public void run() {
        int num = 1;
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Thread 1: " + num);
            num++; // continues indefinitely
        }
    }
}
