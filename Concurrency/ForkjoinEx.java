package Concurrency;

import java.util.concurrent.*;

public class ForkjoinEx {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        long n = 20;

        FibonacciTask task = new FibonacciTask(n);
        long result = pool.invoke(task);

        System.out.println("Fibonacci(" + n + ") = " + result);
        pool.close();
    }

    static class FibonacciTask extends RecursiveTask<Long> {
        private final long n;

        FibonacciTask(long n) {
            this.n = n;
        }

        @Override
        protected Long compute() {
            if (n <= 1) {
                return n;
            }

            // Split into subtasks
            FibonacciTask f1 = new FibonacciTask(n - 1);
            f1.fork(); // asynchronously compute (n-1)

            FibonacciTask f2 = new FibonacciTask(n - 2);
            long result2 = f2.compute(); // compute (n-2) directly

            long result1 = f1.join(); // wait for f1 result

            return result1 + result2;
        }
    }
}
