package demo3;

public class CodeCacheExample {

    public static void main(String[] args) {
        System.out.println("Starting CodeCache example...");

        // Trigger JIT compilation by repeatedly calling a method
        for (int i = 0; i < 100000; i++) {
            calculateFibonacci(30);  // Fibonacci is a computationally heavy method
        }

        System.out.println("Finished triggering JIT compilation.");
        System.out.println("You can monitor CodeCache usage using jconsole or jvisualvm.");
    }

    // A method that calculates the nth Fibonacci number
    public static int calculateFibonacci(int n) {
        if (n <= 1) return n;
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }
}

