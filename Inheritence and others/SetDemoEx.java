package com.company;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemoEx {

    public static  void main(String[] args){

        Set<String> set = new TreeSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("F");
        set.add("E");
        set.add("D");

        Iterator<String> it = set.iterator();

        while (it.hasNext()){
            Object item = it.next();
            System.out.println(item + " ");
        }
    }

}
