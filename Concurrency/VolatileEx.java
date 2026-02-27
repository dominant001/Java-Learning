package Concurrency;

public class VolatileEx {
    public static void main(String[] args) {
        SharedObj sharedObj = new SharedObj();

        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            sharedObj.setTrue();
        });
        Thread readerThread = new Thread(() -> sharedObj.ifFlagTrue());

        writerThread.start();
        readerThread.start();

    }
}

class SharedObj {
    private volatile boolean flag;

    public void ifFlagTrue() {
        while (!flag) {

        }
        System.out.println("Flag is true, proceeding with reader operation.");
    }

    public void setTrue() {
        System.out.println("Writer mmade this flag true.");
        flag = true;
    }
}
