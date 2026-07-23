// Question 3: Thread priorities and shared resource access

class Counter {
    int count = 0;
    
    // synchronized method to control access to shared resource
    public synchronized void increment() {
        count++;
    }
}

class CounterThread extends Thread {
    Counter counter;
    
    CounterThread(Counter c, String name) {
        super(name);
        this.counter = c;
    }
    
    public void run() {
        for (int i = 0; i < 500; i++) {
            counter.increment();
        }
        System.out.println(getName() + " (Priority: " + getPriority() + ") finished.");
    }
}

class Question3 {
    public static void main(String[] args) {
        Counter sharedCounter = new Counter();
        
        CounterThread t1 = new CounterThread(sharedCounter, "Low-Priority-Thread");
        CounterThread t2 = new CounterThread(sharedCounter, "Mid-Priority-Thread");
        CounterThread t3 = new CounterThread(sharedCounter, "High-Priority-Thread");
        
        // Setting different priorities
        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.NORM_PRIORITY); // 5
        t3.setPriority(Thread.MAX_PRIORITY); // 10
        
        // Starting threads
        t1.start();
        t2.start();
        t3.start();
        
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println("Final Count value: " + sharedCounter.count);
    }
}
