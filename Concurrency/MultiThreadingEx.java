package Concurrency;

//Thread Creation via interface and class -------------------------------------------------------------------------------

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

public class MultiThreadingEx {
    public static void main(String[] args) {
        // World world = new World();
        // world.start();

        NewWorld newWorld = new NewWorld();
        Thread thread = new Thread(newWorld);
        thread.start();
        for (;;) {
            System.out.println("Hello world from main thread " + Thread.currentThread().getName());
        }
    }
}

class World extends Thread {
    @Override
    public void run() {
        for (;;) {
            System.out.println("Hello world from thread " + Thread.currentThread().getName());
        }
    }
}

class NewWorld implements Runnable {

    @Override
    public void run() {
        for (;;) {
            System.out.println("Hello world from runnable " + Thread.currentThread().getName());
        }
    }
}

// ------------------------------------------------------------------------------------------------------------------------------------

// Lifecycle of a thread
// Example----------------------------------------------------------------------------------------
class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("RUNNING IN THREAD");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        System.out.println("IN MAIN " + myThread.getState());
        myThread.start();
        System.out.println("IN MAIN " + myThread.getState());
        myThread.sleep(1000); // used to pause the current thread for 1 second and control goes to thread 0
        System.out.println("IN MAIN " + myThread.getState());
        myThread.join(); // used to wait for the thread to finish and control came back to main thread
        System.out.println("IN MAIN " + myThread.getState());
    }
}

// ------------------------------------------------------------------------------------------------------------------------------------

// Methods
// Examples---------------------------------------------------------------------------------------------------------------
class MethodsEx extends Thread {

    public MethodsEx(String name) {
        super(name); // Call the constructor of the Thread class with the thread name
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(
                        Thread.currentThread().getName() + " Count : " + i + " , Priority : "
                                + Thread.currentThread().getPriority());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        MethodsEx t1 = new MethodsEx("MyThread");
        MethodsEx t2 = new MethodsEx("MyThread2");
        t2.setDaemon(true);
        t1.start();
        t1.yield(); // Yielding the thread to allow other threads to run
        t2.start();
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.interrupt();
        t1.join();

        System.out.println("Thread has  finished execution, now main thread can continue.");
    }

}

// ------------------------------------------------------------------------------------------------------------------------------------

// Synchrinization
// Example-------------------------------------------------------------------------------------------------
class Counter {
    private int count = 0;

    // critical section start
    // synchronized method to ensure that only one thread can increment the count at
    // a time
    public synchronized void increment() {
        count++;
    }

    public void decrement() {
        synchronized (this) {
            count--;
        }
    }
    // critical section end

    public int getCount() {
        return count;
    }
}

class SynchrinizationThread extends Thread {
    private Counter counter;

    public SynchrinizationThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
        System.out.println("Final count: " + counter.getCount());
    }
}

class SynchrinizationEx {
    public static void main(String[] args) {
        Counter counter = new Counter();
        SynchrinizationThread thread1 = new SynchrinizationThread(counter);
        SynchrinizationThread thread2 = new SynchrinizationThread(counter);
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter.getCount());
    }
}

// ------------------------------------------------------------------------------------------------------------------------------------

// Locks
// Examples---------------------------------------------------------------------------------------------------------------

class BankAccount {
    private int balance = 100;
    private final Lock lock = new ReentrantLock();

    public void withdrawl(int amt) {

        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {

                System.out.println(Thread.currentThread().getName() + " is trying to withdraw " + amt);
                if (amt > balance) {
                    System.out.println(
                            Thread.currentThread().getName() + "Insufficient balance for withdrawal of " + amt);
                } else {

                    try {
                        System.out.println(Thread.currentThread().getName() + " procedding withdrawing " + amt);
                        Thread.sleep(10000);
                        balance -= amt;
                        System.out.println(
                                Thread.currentThread().getName() + " Withdrawl Complete, new balance is " + balance);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }

                }
            } else {
                System.out.println(Thread.currentThread().getName() + " could not accquire the lock, will try later");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                account.withdrawl(50);
            }
        };
        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        t1.start();
        t2.start();
    }
}