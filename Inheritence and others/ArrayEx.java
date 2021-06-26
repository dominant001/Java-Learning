package com.company;

import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;

import java.util.ArrayList;
import java.util.List;

public class ArrayEx {

    public static void main(String[] args){

        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("is");
        list.add("a");
        list.add("Object");
        list.add("Orientec");
        list.add("Programming");

        for (Object lis : list) { //clever for loop
        }
        System.out.println(list);
    }
}
