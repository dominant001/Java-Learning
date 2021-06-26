package com.company;

import java.util.Scanner;

class Account{
    private  int bal;
    public Account(int bal)
    {
        this.bal = bal;
        System.out.println("Avilable Balance : " + bal);
    }
    public boolean inSufficiebtBalance(int w)
    {
        if (bal>w){
            return true;
        }
        else
            return false;
    }
    public void withdrawAmt(int amt){
        bal = bal-amt;
        System.out.println("Withdraw money is : "+ amt);
        System.out.println("Your balance amount is : " + bal);
    }
}

class Customer implements Runnable {

    private String name;
    private Account account;
    public Customer(Account account,String name)
    {
        this.account = account;
        this.name = name;
    }

    @Override
    public void run()
    {
        Scanner sc = new Scanner(System.in);

        //that part of code is synchronized where the same resource can be used by multiple threads//

            synchronized (account)
            {
                System.out.println(name + ", Enter your amount you want to withdraw : ");
                int amt = sc.nextInt();
                if (account.inSufficiebtBalance(amt)) {
                    System.out.println(name);
                    account.withdrawAmt(amt);
                }
                else{
                    System.out.println("Insufficient Balance:");
                }
            }
    }
}

public class threadSynchonizationEx {

    public static void main(String[] args){

        Account a1 = new Account(1000);
        Customer c1 = new Customer(a1,"Ram");
        Customer c2 = new Customer(a1,"Shyam");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}




