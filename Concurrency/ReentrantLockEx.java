package Concurrency;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class ReentrantLockEx {

    private final Lock lock = new ReentrantLock();

    public void outerLoop() {
        lock.lock();
        try {
            System.out.println("Outer Loop");
            innerLoop();
        } finally {
            System.out.println("Lock 1 released");
            lock.unlock();
        }
    }

    public void innerLoop() {
        lock.lock();
        try {
            System.out.println("Inner Loop");
        } finally {
            System.out.println("Lock 2 released");
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantLockEx reentrantLockEx = new ReentrantLockEx();
        reentrantLockEx.outerLoop();
    }
}
