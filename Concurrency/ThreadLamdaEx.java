package Concurrency;

public class ThreadLamdaEx {

    public static void main(String[] args) {

        // Runnable runnable = () -> System.out.println("hello");

        Thread t1 = new Thread(() -> System.out.println("hello"), "Thread-1");
        t1.start();
    };
}
