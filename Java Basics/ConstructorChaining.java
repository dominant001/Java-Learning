package com.company;

class Ax{
    public Ax(){
        System.out.println("A1");
    }
}

class Bx extends Ax{

    public Bx(){
        this(5);// call the second Bx constructer
        System.out.println("B1");
    }

    public Bx(int x){
        super();// call the parent class constructer
        System.out.println("B2");
    }
}

public class ConstructorChaining {
    public static void main(String[] args){
        Bx obj = new Bx();
    }
}


//if we not write the super or this the compiler already write super in sub class to call the parent class constructer
//but if we want to call the other constructer of the same class instead of parent class so we can  write this.