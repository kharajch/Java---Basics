import java.util.Scanner;

public class find_the_GCD_of_two_numbers_using_recursion {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, hcf;

        System.out.print("Enter a : ");
        a = sc.nextInt();
        System.out.print("Enter b : ");
        b = sc.nextInt();
        hcf = gcd(a, b);
        System.out.printf("The GCD Of %d & %d Is : %d", a, b, hcf);
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
