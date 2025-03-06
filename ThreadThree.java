
public class ThreadThree extends Thread {
    @Override
    public void run() {
        int num = -1;
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Thread 3: " + num);
            num--; // continues decreasing indefinitely
        }
    }
}
