package com.company;

import java.util.*;

public class LinkedListEx {

    public static List<Object> concatenateLists(List<Object> listOne, List<Object> listTwo) {
        //Implement your logic here and change the return statement accordingly
        List Temp = new LinkedList();
        Iterator it = ((LinkedList)listTwo).descendingIterator();
        while(it.hasNext()){
            Temp.add(it.next());
        }
        listOne.addAll(Temp);
//        for(int i = listTwo.size()-1; i>=0;i--){
//            Temp.add(listTwo.get(i));
//        }
//        listOne.addAll(Temp);

        return listOne;
    }


    public static void main(String args[]) {
        List<Object> listOne = new LinkedList<Object>();
        listOne.add("Hello");
        listOne.add(102);
        listOne.add(25);
        listOne.add(38.5);

        List<Object> listTwo = new LinkedList<Object>();
        listTwo.add(150);
        listTwo.add(200);
        listTwo.add('A');
        listTwo.add("Welcome");

        List<Object> concatenatedList = concatenateLists(listOne, listTwo);

        System.out.println("Concatenated linked list:");
        for (Object value : concatenatedList) {
            System.out.print(value+" ");
        }
    }
}