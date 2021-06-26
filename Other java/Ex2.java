package com.company;

public class Ex2 {
    public static void main(String[] args){
        int anum=  55;
        for (int cnt=0;cnt<10;cnt++){
            add(anum);
        }
        System.out.println(anum);
    }

    private static void add(int anum) {
        anum++;
    }
}
