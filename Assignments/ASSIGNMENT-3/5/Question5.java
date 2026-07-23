import java.util.Scanner;

class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        // 1. Find the length
        System.out.println("String: " + str);
        System.out.println("Length: " + str.length());
        
        // 2. Convert to uppercase and lowercase
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        
        // 3. Check for substring
        System.out.println("Contains 'Java'? " + str.contains("Java"));
        
        // 4. Replace character
        System.out.println("After replacing 'a' with 'o': " + str.replace('a', 'o'));
        
        sc.close();
    }
}
