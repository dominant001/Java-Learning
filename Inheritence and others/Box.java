package com.company;

public class Box {

    int length,breadth,height;

    public void setDimension(int l , int b , int h){
        length = l; breadth = b; height = h;
    }
    public void showDimension(){
        System.out.println(length);
        System.out.println(breadth);
        System.out.println(height);
    }
    public static void main(String[] args){

        Box b1 = new Box();
        b1.setDimension(12,10,5);
        b1.showDimension();
        b1 = new Box();
        b1.showDimension();

    }
}
