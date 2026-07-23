import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get user name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        // Get user age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        // Print formatted output
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }
}
