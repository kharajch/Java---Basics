import java.util.Scanner;

public class display_all_prime_numbers_between_1_to_N {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        
        System.out.println("Prime numbers between 1 and " + N + ":");
        for (int num = 2; num <= N; num++) {
                
            boolean isPrime = true;

                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
