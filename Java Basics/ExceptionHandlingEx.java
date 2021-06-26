package com.company;

import java.util.Scanner;

public class ExceptionHandlingEx {

    public void DTOC(){
        // default throw and out catch
        System.out.println("Enter the value of Y");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        try {
            System.out.println("Try block");
            System.out.println(30/y);
            System.out.println("Ankit");
        }catch (Exception e){
            System.out.println("Exception" + e.getMessage());
        }finally {
            System.out.println("Finally");
        }
        System.out.println("After Exception");
    }

    public void OTDC(){
        //out throw and default catch
        int balance =  3000;
        System.out.println("Your Current Balance is " + balance);
        System.out.println("Enter the Amount which you want to withdraw");
        Scanner sc = new Scanner(System.in);
        int withdrawAmt = sc.nextInt();

        if (balance<withdrawAmt)
            throw new ArithmeticException("Insufficient Balance");

        balance = balance - withdrawAmt;
        System.out.println("Transaction Completed Sucessfully");
        System.out.println("Your Balance after transaction  is " + balance);
    }

    public void OTOC(){
        //our throw our catch
        int balance =  3000;
        System.out.println("Your Current Balance is " + balance);
        System.out.println("Enter the Amount which you want to withdraw");
        Scanner sc = new Scanner(System.in);
        int withdrawAmt = sc.nextInt();

        try {
            if (balance<withdrawAmt)
                throw new ArithmeticException("Insufficient Balance");
            balance = balance - withdrawAmt;
            System.out.println("Transaction Completed Sucessfully");
            System.out.println("Your Balance after transaction  is " + balance);
        }catch (ArithmeticException e){
            System.out.println("Exception : " + e.getMessage());
        }
    }

    public static void main(String[] args){
           ExceptionHandlingEx ex = new ExceptionHandlingEx();
           //ex.DTOC();
            //ex.OTDC();
            ex.OTOC();
    }
}


