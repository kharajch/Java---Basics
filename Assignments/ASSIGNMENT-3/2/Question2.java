class Question2 {
    public static void main(String[] args) {
        // Create and initialize a 3x3 2-D integer array
        int[][] matrix = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };

        int totalSum = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Calculate and print sum of each row
        System.out.println("\nRow Sums:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
            totalSum += rowSum;
        }

        // Calculate and print sum of each column
        System.out.println("\nColumn Sums:");
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + ": " + colSum);
        }

        // Print total sum
        System.out.println("\nTotal Sum of all elements: " + totalSum);
    }
}
