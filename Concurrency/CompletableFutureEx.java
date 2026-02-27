package Concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureEx {
    public static void main(String[] args) {

        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("CompletableFuture is running in a separate thread.");
            return "Hello";
        }).thenApply(ok -> {
            System.out.println("CompletableFuture has completed its task." + ok);
            return ok;
        });

        String s = "";
        try {
            completableFuture.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } // Waits for the CompletableFuture to complete

        System.out.println("Result from CompletableFuture: " + s);
        System.out.println("Main thread is proceeding after CompletableFuture is completed.");
    }
}
