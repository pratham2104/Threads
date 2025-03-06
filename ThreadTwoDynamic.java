
public class ThreadTwoDynamic extends Thread {
    @Override
    public void run() {
        // Start from 'A' and initially move forward
        char current = 'A';
        boolean forward = true;
        
        while (true) {
            try {
                Thread.sleep(1000); // sleep for 1 second before printing
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            
            System.out.println("Thread 2: " + current);
            
            // Check the current character and adjust the direction dynamically
            if (forward) {
                if (current == 'Z') {
                    // When we reach 'Z', reverse direction
                    forward = false;
                    current--; // next character will be 'Y'
                } else {
                    current++;
                }
            } else { // moving in reverse
                if (current == 'A') {
                    // When we reach 'A', switch direction again
                    forward = true;
                    current++; // next character will be 'B'
                } else {
                    current--;
                }
            }
        }
    }
}
