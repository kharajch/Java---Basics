import java.util.Scanner;

class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the first array: ");
        int n1 = sc.nextInt();
        int[] array1 = new int[n1];
        System.out.println("Enter " + n1 + " elements for the first array:");
        for (int i = 0; i < n1; i++) {
            array1[i] = sc.nextInt();
        }
        
        System.out.print("Enter the size of the second array: ");
        int n2 = sc.nextInt();
        int[] array2 = new int[n2];
        System.out.println("Enter " + n2 + " elements for the second array:");
        for (int i = 0; i < n2; i++) {
            array2[i] = sc.nextInt();
        }
        
        int[] result = concatenate(array1, array2);
        
        System.out.println("Concatenated array elements:");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
        
        sc.close();
    }
    
    // Method to concatenate two arrays
    static int[] concatenate(int[] a, int[] b) {
        int[] combined = new int[a.length + b.length];
        
        // Copy first array
        for (int i = 0; i < a.length; i++) {
            combined[i] = a[i];
        }
        
        // Copy second array
        for (int i = 0; i < b.length; i++) {
            combined[a.length + i] = b[i];
        }
        
        return combined;
    }
}
