package com.company;

public class InheritanceMain {

    public static void main(String[] args){

        Inheritance2 I1 = new Inheritance2();

        I1.setName("Ankit");
        I1.setAge(22);
        I1.setRollno(1716510902);
        I1.setBranch("C.S.E");

        System.out.println("Name : " + I1.getName());
        System.out.println("Age : " + I1.getAge());
        System.out.println("Roll No. : " + I1.getRollno());
        System.out.println("Branch : " + I1.getBranch());
    }
}
