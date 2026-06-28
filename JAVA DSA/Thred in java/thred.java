// package JAVA DSA.Thred in java; // Note: Package name cannot contain spaces, so this is commented out.

// Naya Thread banane ka Tarika 1: Thread class ko extend karke
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            // Thread.currentThread().getName() se current running thread ka naam milta hai
            System.out.println(Thread.currentThread().getName() + " (extends Thread) is running: " + i);
            try {
                // Thread ko 500 milliseconds ke liye pause/sleep karenge taaki concurrency dikhe
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread got interrupted: " + e.getMessage());
            }
        }
    }
}

// Naya Thread banane ka Tarika 2: Runnable interface ko implement karke (Yeh standard/best practice hai)
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " (implements Runnable) is running: " + i);
            try {
                // Thread ko 500 milliseconds ke liye pause karenge
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Runnable Thread got interrupted: " + e.getMessage());
            }
        }
    }
}

// Main class ka naam file name (thred.java) se match hona chahiye agar hum classes ko run kar rahe hain
public class thred {
    public static void main(String[] args) {
        System.out.println("--- Main Method/Thread Started ---");

        // 1. Thread class extend karne wale thread ko start karna:
        MyThread t1 = new MyThread();
        t1.setName("Thread-A");
        t1.start(); // start() naya thread generate karta hai aur run() ko background me chalata hai

        // 2. Runnable implement karne wale thread ko start karna:
        MyRunnable runnableObject = new MyRunnable();
        Thread t2 = new Thread(runnableObject); // Runnable object ko Thread constructer me pass karte hain
        t2.setName("Thread-B");
        t2.start();

        // 3. Main thread ka apna kaam:
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread (main) is running: " + i);
            try {
                // Main thread 400 milliseconds ke liye sleep karega
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println("Main thread got interrupted: " + e.getMessage());
            }
        }

        System.out.println("--- Main Method/Thread Ended ---");
    }
}