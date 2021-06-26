package com.company;

import java.util.Scanner;

public class Bank1
{
    int accountNo;
    String name;
    String branch;
    long mobileNo;
    float amount;
    int finalBal;

    public Bank1() {
    }
        void insert(int accountNo, String name, String branch, long mobileNo, float amount){
        this.accountNo = accountNo;
        this.name = name;
        this.branch = branch;
        this.mobileNo = mobileNo;
        this.amount = amount;
    }
    /*public void deposite(float amt) {
        Scanner amt = new Scanner("Enter the amount You Want to withdraw");
        finalBal = amount+amt;
        System.out.println(amt + "Deposited");
    }
    public void Withdraw(int amount) {
        if(amount<amnt){
            System.out.println("insufficient Balance");
        }
        else{
            amount=amount-amnt;
            System.out.println(amnt+"Withdrawn");
        }
    }

    public void CheckBalance( int amount) {
            System.out.println(amount + "Amount");


    }
    */
    public void Display(){
        System.out.println("Account No. = " + accountNo + " , Name = " + name + " , Branch = " + branch + " , Mobile No. = " + mobileNo + " , Amount = " + amount);
    }



}
