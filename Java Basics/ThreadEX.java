package com.company;
class Thread1class implements Runnable
{
    @Override
    public void run()
    {
        int i;
        for (i=0;i<10;i++)
            System.out.println("Thread A" + i);
    }
}
class Thread2class implements Runnable
{
    @Override
    public void run()
    {
        int i;
        for (i=0;i<10;i++)
            System.out.println("Thread B" + i);
    }
}
    public class ThreadEX {
        public static void main(String[] args) {

            //thread by runnable class

            Thread t1 = new Thread(new Thread1class());
            Thread t2 = new Thread(new Thread2class());
            t1.start();
            t2.start();

        }
    }


