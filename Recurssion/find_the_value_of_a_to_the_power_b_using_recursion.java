
import java.util.Scanner;

public class find_the_value_of_a_to_the_power_b_using_recursion {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, power;

        System.out.print("Enter a : ");
        a = sc.nextInt();
        System.out.print("Enter b : ");
        b = sc.nextInt();
        power = pow(a, b);
        System.out.printf("%d To The Power %d Is : %d ", a, b, power);
    }

    static int pow(int a, int b) {
        if (b == 0) {
            return 1;
        } 
        else if (b == 1) {
            return a;
        }
        else {
            return (a * pow(a, b-1));
        }
    }
}
