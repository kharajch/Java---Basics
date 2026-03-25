
import java.util.Scanner;

public class display_Fibonacci_series_upto_nth_term {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n, f;

        System.out.print("Enter n : ");
        n = sc.nextInt();

        System.out.println("The Fibonacci Series Upto " + n + "th Term :");

        for (int i = 0; i <= n; i++) {
            f = fib(i);
            System.out.printf("%d ", f);
        }

    }

    static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return (fib(n - 1) + fib(n - 2));
        }
    }
}
