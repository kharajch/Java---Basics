
import java.util.Scanner;

public class swap_values_of_two_variables_without_using_third_variable {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;

        System.out.print("Enter a : ");
        a = sc.nextInt();

        System.out.print("Enter b : ");
        b = sc.nextInt();

        System.out.println("Before Swap :");
        System.out.printf("a : %d \n", a);
        System.out.printf("b : %d \n", b);

        a = a ^ b;
        b = b ^ a;
        a = a ^ b;

        System.out.println("After Swap :");
        System.out.printf("a : %d \n", a);
        System.out.printf("b : %d \n", b);

    }
}
