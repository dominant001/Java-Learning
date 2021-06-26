package com.company;

public class OverloadingEx {

    public static void main(String[] agrs){

        B obj = new B();
        obj.f1(4);
        obj.f1(2,4);
        A o = new A();
        o.f1(2);
    }
}
class A
{
    public void f1(int x)
    {
        System.out.println("This is A");
    }
}
class B extends A
{
    public void f1(int x , int y)
    {
        System.out.println("This is B");
    }


}
/*  Also declare as
class A
{
    public void f1(int x)
    {
        System.out.println("This is A");
    }
     public void f1(int x , int y)
    {
        System.out.println("This is B");
    }
}
class B extends A
{

}
 */
