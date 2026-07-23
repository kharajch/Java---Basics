// Question 2: Multiple threads with different tasks and using join()

class FactorialThread extends Thread {
    public void run() {
        int n = 5;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of 5 is: " + fact);
    }
}

class MessageThread extends Thread {
    public void run() {
        System.out.println("Hello!");
    }
}

class EvenThread extends Thread {
    public void run() {
        System.out.print("Even numbers: ");
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class OddThread extends Thread {
    public void run() {
        System.out.print("Odd numbers: ");
        for (int i = 1; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class Question2 {
    public static void main(String[] args) {
        FactorialThread t1 = new FactorialThread();
        MessageThread t2 = new MessageThread();
        EvenThread t3 = new EvenThread();
        OddThread t4 = new OddThread();
        
        // Starting all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        try {
            // Using join to wait for threads to finish
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println("All threads have finished their tasks.");
    }
}
