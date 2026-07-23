import java.util.Scanner;

class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of Fibonacci elements (n): ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }
        
        // Dynamically allocate the array
        int[] fib = new int[n];
        
        // Fill the array with Fibonacci numbers
        if (n >= 1) fib[0] = 0;
        if (n >= 2) fib[1] = 1;
        
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        
        // Print the array
        System.out.println("Fibonacci array of size " + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
        System.out.println();
    }
}
