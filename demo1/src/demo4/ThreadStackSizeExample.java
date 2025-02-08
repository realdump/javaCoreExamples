package demo4;

public class ThreadStackSizeExample {

    public static void main(String[] args) {
        // Print a message about thread stack size
        System.out.println("Thread stack size demonstration.");

        // Start a thread that will run a method with deep recursion
        Thread thread = new Thread(() -> {
            try {
                causeStackOverflow(100000); // Deep recursion to trigger StackOverflowError
            } catch (StackOverflowError e) {
                System.out.println("StackOverflowError caught! Stack space is insufficient.");
            }
        });

        // Start the thread
        thread.start();

        // Wait for the thread to finish
        try {
            thread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Thread execution completed.");
    }

    // A simple method that recurses to cause StackOverflowError
    private static void causeStackOverflow(int depth) {
        if (depth == 0) return;
        causeStackOverflow(depth - 1); // Recursion will eventually overflow the stack
    }
}
