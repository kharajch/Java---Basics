
import java.util.Scanner;

public class convert_fahrenheit_to_celsius_and_vise_versa {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int op;

        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Please enter your option : ");
        op = sc.nextInt();

        switch (op) {
            case 1:
                far_to_cel();
                break;
            case 2:
                cel_to_far();
                break;
            default:
                System.out.println("Invalid choice!");
        }

    }

    static float far_to_cel() {
        float f, c;
        System.out.print("Enter the temperature in Fahrenheit : ");
        f = sc.nextFloat();
        sc.close();
        c = ((f - 32) * 5 / 9);
        System.out.print("The temperature in Celsius is : " + c);
        return c;
    }

    static float cel_to_far() {
        float f, c;
        System.out.print("Enter the temperature in Celsius : ");
        c = sc.nextFloat();
        sc.close();
        f = (c * 9 / 5) + 32;
        System.out.print("The temperature in Fahrenheit is : " + f);
        return f;
    }
}