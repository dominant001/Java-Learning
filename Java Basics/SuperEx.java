package com.company;

public class SuperEx {

    public static void main(String[] agrs){

        E obj = new E();
        obj.f1();

    }
}

class E{
    int a;
    public void f1(){
    }
}

class F extends E{
    int a;
    @Override
    public void f1() {
        super.f1();
    }

    public void f2(){
        int a;
        a=2;//local variable
        this.a=3;//child class F instance variable
        super.a=4;//super class E instance variable
    }
}
