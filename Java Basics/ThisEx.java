package com.company;

class Box{
    private int l,b,h;//instance variable
    public void setDimension(int l,int b,int h){//local variable
        this.l=l;
        this.b=b;
        this.h=h;
        int area = l*b*h;
        System.out.println(area);
    }
}
public class ThisEx {

    public static void main(String[] args){

        Box b1 = new Box();
        b1.setDimension(12,10,5);
    }
}
//l=l,b=b,h=h name collision problem
