import java.util.Scanner;

class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        // Pass to method and get result
        String reversed = reverseString(input);
        
        System.out.println("The reversed string is: " + reversed);
    }
    
    // Method to reverse a string
    static String reverseString(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }
}
