package com.company;


class threadByThreadClass1 extends Thread
{
    @Override
    public void run() {
        int i;
        for (i=0;i<10;i++)
            System.out.println("Thread 1st = " + i);
    }
}

class threadByThreadClass2 extends Thread
{
    @Override
    public void run() {
        int j;
        for (j=0;j<10;j++)
            System.out.println("Thread 2nd = " + j);
    }
}

public class ThreadEx1 {

    public static void main(String[] args){
        threadByThreadClass1 tc1 = new threadByThreadClass1();
        threadByThreadClass2 tc2 = new threadByThreadClass2();
        tc1.run();
        tc2.run();
    }
}
