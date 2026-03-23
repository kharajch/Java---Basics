import java.util.Scanner;

public class find_factorial_of_n_using_recurrsion {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num, f;

        System.out.print("Enter The Number : ");
        num = sc.nextInt();
        f = fact(num);
        System.out.print("The Factorial Is: " + f);
    }

    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return (n * fact(n - 1));
        }
    }
}
