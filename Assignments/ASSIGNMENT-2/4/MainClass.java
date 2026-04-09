//4.WAP in java to create a class named Counter with a class variable count (static int) that Keeps track of the number of Counter Objects created. Include a static method to return the current values.

class Counter {

    static int count;

    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }

}

public class MainClass {
    public static void main(String[] args) {

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("The Number Of Objects Created Are : " + c3.count);

    }
}
