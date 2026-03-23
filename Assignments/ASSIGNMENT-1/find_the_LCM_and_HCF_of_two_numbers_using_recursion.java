
import java.util.Scanner;

public class find_the_LCM_and_HCF_of_two_numbers_using_recursion {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, hcf, lcm;

        System.out.print("Enter a : ");
        a = sc.nextInt();
        System.out.print("Enter b : ");
        b = sc.nextInt();
        hcf = gcd(a, b);
        System.out.printf("The HCF Of %d & %d Is : %d \n", a, b, hcf);
        lcm = ((a * b) / hcf);
        System.out.printf("The LCM Of %d & %d Is : %d \n", a, b, lcm);
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
