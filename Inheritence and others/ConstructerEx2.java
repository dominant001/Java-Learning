package com.company;

public class ConstructerEx2
{
    public static void main(String[] args){

        ConstructerEx c1 = new ConstructerEx();
        ConstructerEx c2 = new ConstructerEx();

        c1 = new ConstructerEx(101,"Raj",45000);
        c1.display();
        c2= new ConstructerEx(101,"Raj",45000);
        c2.display();
    }
}
