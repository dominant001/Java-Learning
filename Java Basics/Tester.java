package com.company;

import java.util.ArrayList;

public class Tester {

    public static int [] leapyears(int year) {
        //int arr[] = new int[15];
        ArrayList<Integer> y = new ArrayList<Integer>();
        int x = 1;
        boolean leap = true;
        int j = 0;

        for (int i = 0; i < x; i++) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        leap = true;
                        j = j + 1;
                    } else {
                        leap = false;
                    }
                } else {
                    leap = true;
                    j = j + 1;

                }
            } else {
                leap = false;
            }

            x = x + 1;

            if (leap == true) {
                y.add(year);
            }
            if (y.size() == 15){
                break;
            }

            year = year + 1;
            leap = false;

    }
        int arr [] = y.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
    public static void main(String[] args){
        int year = 2000;
        int [] leapYears;
        leapYears = leapyears(year);
        for (int index= 0; index<leapYears.length;index++){
            System.out.println(leapYears[index]);
        }
    }

}
