package com.company;

public class reverseString {
    public static void main(String[] args) {

        String input = "ankit mohan singh";

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input);
        //String[] s = input.split("");
        //for(int i = input.length()-1;i>=0;i--)
        //input.charAt(s[i]);
        System.out.println(stringBuilder.reverse());
    }
}
