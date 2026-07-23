public class Question8 {
    public static void main(String[] args) {
        // Example string (no user input)
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Original: " + sb);

        // Append a string to the end of the buffer
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert a string at a specific position (before "World")
        sb.insert(6, "Beautiful ");
        System.out.println("After insert: " + sb);

        // Delete the portion we just inserted (indices 6..15)
        sb.delete(6, 16);
        System.out.println("After delete: " + sb);

        // Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}

