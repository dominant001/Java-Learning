package com.company;

abstract class x1{
    abstract void show();

    void notshow() {

    }
}

class Yx extends x1{
    @Override
    void show() {
        System.out.println("show");
    }
}

public class ABstract{
    public static void main(String args[]){
        Yx obj = new Yx();
        obj.show();
    }
}
