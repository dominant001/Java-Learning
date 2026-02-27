package Concurrency;

import java.util.concurrent.*;

public class CyclicBarrierEx {
    public static void main(String[] args) {
        int numWorkers = 3;

        CyclicBarrier barrier = new CyclicBarrier(numWorkers, () -> {
            System.out.println("All workers reached the barrier. Proceeding...");
        });

        for (int i = 0; i < numWorkers; i++) {
            new Thread(new Worker(barrier, i)).start();
        }

        // This will execute immediately after starting all worker threads because
        // cyclicbarrier does not block the main thread.
        System.out.println("main");
    }

    static class Worker implements Runnable {
        private CyclicBarrier barrier;
        private int id;

        Worker(CyclicBarrier barrier, int id) {
            this.barrier = barrier;
            this.id = id;
        }

        @Override
        public void run() {
            try {
                System.out.println("Worker " + id + " is doing work...");
                Thread.sleep((long) (Math.random() * 2000));

                System.out.println("Worker " + id + " waiting at barrier...");
                barrier.await(); // waits until all workers arrive

                System.out.println("Worker " + id + " passed the barrier.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
