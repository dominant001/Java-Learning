package com.company;

import java.util.Scanner;

public class Bank2 {


    public static void main(String[] args){

        Bank1 b1 = new Bank1();
       b1.insert(123,"Raj","Kanpur",98889445,45000f);
       b1.Display();


       System.out.println("1 for Deposite");
       System.out.println("2 for Withdraw");
       Scanner sc = new Scanner("Enter Your Choice");




    }

}
