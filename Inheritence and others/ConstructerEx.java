package com.company;

public class ConstructerEx {
    int id;
    String name;
    float Salary;

    public ConstructerEx(){
    }
    public  ConstructerEx(int id,String name,float salary){
        this.id=id;
        this.name=name;
        this.Salary=salary;
    }
    void display(){
        System.out.println(id+" "+name+" "+Salary);
    }
}
