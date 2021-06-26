package com.company;

public class OverridingEx {
    public static void main(String[] agrs){

        D obj = new D();
        obj.f1(4);
        C ob = new C();
        ob.f1(2);
    }
}
class C
{
    public void f1(int x)
    {
        System.out.println("This is C");
    }
}
class D extends C
{
    public void f1(int x)
    {
        System.out.println("This is D");
    }
}
