import java.util.Random;

class Question1 {
    public static void main(String[] args) {
        // Create an array for 10 integers
        int[] numbers = new int[10];
        Random rand = new Random();
        
        // Fill the array with random numbers between 1 and 100
        for (int i = 0; i < 10; i++) {
            numbers[i] = rand.nextInt(100) + 1;
        }
        
        // Print the array elements
        System.out.println("The 10 random numbers are:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
