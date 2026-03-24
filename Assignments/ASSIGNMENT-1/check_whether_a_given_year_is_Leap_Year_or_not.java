
import java.util.Scanner;

public class check_whether_a_given_year_is_Leap_Year_or_not {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int y;

        System.out.print("Enter Year : ");
        y = sc.nextInt();

        if (y % 4 == 0 || y % 100 == 0 || y % 400 == 0) {
            System.out.printf("The Year Is Leap year");
        } else {
            System.out.printf("The Year Is Not Leap year");

        }
    }
}
