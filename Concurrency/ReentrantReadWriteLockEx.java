package Concurrency;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.Lock;

public class ReentrantReadWriteLockEx {

    private int count = 0;

    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    private final Lock readLock = readWriteLock.readLock();

    private final Lock writeLock = readWriteLock.writeLock();

    public void increment() {
        writeLock.lock();
        try {
            count++;
        } finally {
            writeLock.unlock();
        }
    }

    public int getCount() {
        readLock.lock();
        try {
            return count;
        } finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReentrantReadWriteLockEx reentrantReadWriteLockEx = new ReentrantReadWriteLockEx();

        Runnable readTask = new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(
                            Thread.currentThread().getName() + " read : " + reentrantReadWriteLockEx.getCount());
                }
            }
        };

        Runnable writeTask = new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    reentrantReadWriteLockEx.increment();
                    System.out.println(Thread.currentThread().getName() + " incremented ");
                }
            }
        };

        Thread readThread1 = new Thread(readTask, "ReadThread-1");
        Thread readThread2 = new Thread(readTask, "ReadThread-2");
        Thread writeThread1 = new Thread(writeTask, "WriteThread-1");

        writeThread1.start();
        readThread1.start();
        readThread2.start();

        writeThread1.join();
        readThread1.join();
        readThread2.join();

        System.out.println("Final count: " + reentrantReadWriteLockEx.getCount());
    }
}
