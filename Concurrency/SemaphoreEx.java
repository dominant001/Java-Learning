package Concurrency;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        int permits = 2; // Only 2 threads can access at once
        Semaphore semaphore = new Semaphore(permits);

        for (int i = 0; i < 5; i++) {
            new Thread(new Worker(semaphore, i)).start();
        }
    }

    static class Worker implements Runnable {
        private Semaphore semaphore;
        private int id;

        Worker(Semaphore semaphore, int id) {
            this.semaphore = semaphore;
            this.id = id;
        }

        @Override
        public void run() {
            try {
                System.out.println("Worker " + id + " waiting for permit...");
                semaphore.acquire(); // tries to get a permit
                System.out.println("Worker " + id + " acquired permit.");

                Thread.sleep((long) (Math.random() * 2000)); // simulate work

                System.out.println("Worker " + id + " releasing permit.");
                semaphore.release(); // releases permit
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
