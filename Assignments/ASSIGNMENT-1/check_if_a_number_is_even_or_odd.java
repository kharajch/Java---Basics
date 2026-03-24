
import java.util.Scanner;

public class check_if_a_number_is_even_or_odd {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num;

        System.out.print("Enter The Number : ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.print("The Number Is Even.");
        } else {
            System.out.print("The Number Is Odd.");

        }

    }
}
