package com.company;

public class InitializationBlockEx {
    private int x ;
    {
        System.out.println("Initialization Block X = " +x);
        x=5;
    }
    public InitializationBlockEx(){
        System.out.println("Constructer x = " +x);
    }
    public static void main(String[] args){
        InitializationBlockEx i1 = new InitializationBlockEx();
        InitializationBlockEx i2 = new InitializationBlockEx();

    }
}
