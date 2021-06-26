package com.company;

public class ConstructerEx {


    private int l,b,h;

    public ConstructerEx(){
        l=10;
        b=20;
        h=6;
    }

    public ConstructerEx(int L, int B, int H) {
        this.l = L;
        this.b = B;
        this.h = H;
    }

    public static void main(String[] args){
        ConstructerEx c1 = new ConstructerEx();
        ConstructerEx c2 = new ConstructerEx(20,15,6);
        System.out.println(c1);
        System.out.println(c2);
    }
}
