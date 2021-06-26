package com.company;

public class StaticEx {

    int a;
    static int b;

    public void fun1(){

    }

    public static void fun2(){

    }

    static class test{

        public static String country = "India";
    }

    public static void main(String[] args){

        StaticEx ob1 = new StaticEx();
        System.out.println(ob1.a = 4);
        ob1.fun1();

        System.out.println(StaticEx.b=5);
        StaticEx.fun2();
        System.out.println(test.country);
    }

}
