
import java.util.Scanner;

public class find_the_largest_number_among_4_numbers_using_if_else_statement {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        float a, b, c, d, l;
        System.out.print("Enter a : ");
        a = sc.nextFloat();

        System.out.print("Enter b : ");
        b = sc.nextFloat();

        System.out.print("Enter a : ");
        c = sc.nextFloat();

        System.out.print("Enter b : ");
        d = sc.nextFloat();

        if (a > b) {
            l = a;
            if (a < c) {
                l = c;
                if (c < d) {
                    l = d;
                }
            } else if (a > c) {

                if (a < d) {
                    l = d;
                }
            }

        } else {
            l = b;
            if (b < c) {
                l = c;
                if (c < d) {
                    l = d;
                }

            } else if (b > c) {

                if (b < d) {
                    l = d;
                }
            }
        }

        System.out.printf("The Largest Among %f , %f , %f, %f Is %f", a, b, c, d, l);
    }
}
