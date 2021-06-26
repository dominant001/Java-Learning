package com.company;

public class Inheritance extends Inheritance1 {

    int bonus = 10000;

    public static void main(String[] args){

        Inheritance I = new Inheritance();

        System.out.println("Salary : "+I.salary);
        int c = +I.salary+I.bonus;
        System.out.println("Total Salary : "+  c);
    }
}
