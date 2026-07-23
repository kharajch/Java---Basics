// Question 1: Creating threads using Thread class and Runnable interface

// Class extending Thread
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread Class: " + i);
        }
    }
}

// Class implementing Runnable
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Interface: " + i);
        }
    }
}

class Question1 {
    public static void main(String[] args) {
        // Creating thread using Thread class
        MyThread t1 = new MyThread();
        
        // Creating thread using Runnable interface
        MyRunnable myRun = new MyRunnable();
        Thread t2 = new Thread(myRun);
        
        // Starting both threads
        t1.start();
        t2.start();
    }
}
