class Question6 {
    public static void main(String[] args) {
        // String immutability demo
        String s1 = "Java";
        System.out.println("Original s1: " + s1);
        
        s1.concat(" Programming"); // This doesn't change s1
        System.out.println("s1 after concat call (stays same): " + s1);
        
        String s2 = s1.concat(" Programming");
        System.out.println("New string s2 (after concat): " + s2);
        
        // Difference between == and .equals()
        String strA = "Hello";
        String strB = new String("Hello");
        
        System.out.println("strA: " + strA);
        System.out.println("strB (new String): " + strB);
        
        System.out.println("Using == (checks memory address): " + (strA == strB));
        System.out.println("Using .equals() (checks content): " + strA.equals(strB));
    }
}
