package com.company;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

    public static void main(String[] args){

        Map map = new HashMap();

        map.put(1,"ram");
        map.put(2,"ajay");
//individual print the values in behalf of key/////////////////////////
        for (Object ob : map.keySet()){
            System.out.println(ob + "-" + map.get(ob));
        }
//print in a list format///////////////////////////////////////////////
        System.out.println(map.entrySet());
    }

}
