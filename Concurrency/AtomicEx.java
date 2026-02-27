package Concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicEx {
    AtomicInteger counter = new AtomicInteger(0);

    public void incremental() {
        counter.incrementAndGet();
    }

    public int getCounter() {
        return counter.get();
    }

    public static void main(String[] args) throws InterruptedException {

        AtomicEx sharedObj = new AtomicEx();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sharedObj.incremental();
            }
            ;
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sharedObj.incremental();
            }
            ;
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Counter value: " + sharedObj.getCounter());
    }
}
