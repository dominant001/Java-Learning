package Concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorFrameworkEx {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        ExecutorService executorService = Executors.newFixedThreadPool(9);

        for (int i = 1; i <= 10; i++) {
            final int iFinal = i;
            executorService.submit(() -> {
                int res = factorial(iFinal);
                System.out.println("Factorial of " + iFinal + " is: " + res);
            });
        }

        executorService.shutdown();

        try {
            while (!executorService.awaitTermination(10, TimeUnit.MILLISECONDS)) {
                System.out.println("Waiting for tasks to finish...");
            }

        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Uncomment the following lines to use multiple thread for calculating
        // factorials
        // Thread[] threads = new Thread[10];

        // for (int i = 1; i <= 10; i++) {
        // int finalI = i;
        // threads[i - 1] = new Thread(() -> {
        // int res = factorial(finalI);
        // System.out.println("Factorial of " + finalI + " is: " + res);
        // });
        // threads[i - 1].start();
        // }

        // for (Thread thread : threads) {
        // try {
        // thread.join();
        // } catch (InterruptedException e) {
        // Thread.currentThread().interrupt();
        // }
        // }

        // Uncomment the following lines to use a single thread for calculating
        // factorials
        // Thread thread1 = new Thread(() -> {
        // for (int i = 1; i <= 10; i++) {
        // int res = factorial(i);
        // System.out.println("Factorial of " + i + " is: " + res);
        // }
        // });

        // thread1.start();

        System.out
                .println("Time taken : " + (System.currentTimeMillis() - startTime) + " ms");
    }

    public static int factorial(int n) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int result = 1;
        for (int i = n; i > 1; i--) {
            result *= i;
        }
        return result;
    }
}

// This code demonstrates the use of Executor Framework in Java (Callable &
// Runnable)

class ExecutorsEx {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(() -> 42);

        System.out.println(future.get());

        if (future.isDone()) {
            System.out.println("Task is already done.");
        }

        executorService.shutdown();
        System.out.println(executorService.isShutdown());
        Thread.sleep(1000);
        System.out.println(executorService.isTerminated());
    }
}

class ExecutorInvokeEx {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // invoke all Example
        Callable<Integer> call1 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 1");
            return 1;
        };
        Callable<Integer> call2 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 2");
            return 2;
        };
        Callable<Integer> call3 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 3");
            return 3;
        };

        List<Callable<Integer>> tasks = Arrays.asList(call1, call2, call3);
        // List<Future<Integer>> res = executorService.invokeAll(tasks);

        List<Future<Integer>> res = null;
        try {
            res = executorService.invokeAll(tasks, 1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {

        }

        for (Future<Integer> itr : res) {
            try {
                System.out.println("Result: " + itr.get());

            } catch (CancellationException e) {

            } catch (InterruptedException e) {

            } catch (ExecutionException e) {

            }
        }
        executorService.shutdown();

        System.out.println("Hello World");
    }
}

class ScheduledExecutorServiceEx {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        // Schedule a task to run after a fixed delay and terminate after a certain time
        scheduler.scheduleAtFixedRate(() -> System.out.println("Task executed after every 2 second"), 2, 2,
                TimeUnit.SECONDS);
        scheduler.schedule(() -> {
            System.out.println("Initiating shutdown");
            scheduler.shutdown();
        }, 10, TimeUnit.SECONDS);

        // Uncomment the following line to schedule a task with a fixed delay
        // scheduler.schedule(() -> System.out.println("Schedule after 2 second delay"),
        // 2, TimeUnit.SECONDS);
        // scheduler.shutdown();
    }
}