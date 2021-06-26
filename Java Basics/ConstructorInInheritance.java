package com.company;

class G{

    int a;
    public G(int x){
        a=x;
        System.out.println("a" + a);
    }
}
class H extends G{

    int b;
    public H(){
        super(4);//explicitly call the parent class constructer otherwise its call automatically
        System.out.println("b");
    }
}
public class ConstructorInInheritance {
    public static void main(String[] args){
        H ob = new H();

    }
}
