package com.company;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

    public static void main(String[] args){



        LinkedList list = new LinkedList();
        list.add(0,"Ram");
        list.add(1,"Ajay");
        list.add(2,"Raj");


        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
