
public class ThreadFour extends Thread {
    @Override
    public void run() {
        char[] symbols = {'#', '%', '$', '*', '+', '-'};
        while (true) {
            for (char symbol : symbols) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Thread 4: " + symbol);
            }
        }
    }
}
