package com.company;

import javax.rmi.CORBA.StubDelegate;

public class TestStudent {
    public static void main(String[] args){
        Main m = new Main();

        m.id=101;
        m.name="Ram";


        int avrg =m.average(50,70);
        System.out.println("Name = " + m.name + " , ID : "+ m.id + " , Average = " +  avrg);
    }

}
