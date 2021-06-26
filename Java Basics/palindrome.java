package com.company;

import java.util.Scanner;
import java.util.Stack;

public class palindrome {
    public static void main(String[] args){
        String inputstring;
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        inputstring = sc.nextLine();
        Stack stack = new Stack();

        for(int i =0; i< inputstring.length();i++){
            stack.push(inputstring.charAt(i));
        }
        String reversestring = "";
        while (!stack.isEmpty()){
            reversestring = reversestring+stack.pop();
        }
        //System.out.println(reversestring);

        if(inputstring.equals(reversestring)){
            System.out.println("entred String is palindrome ");
            System.out.println("input String is : " + inputstring  + " , reverse string is : " + reversestring) ;
        }
        else {
            System.out.println("entred String is not a palindrome ");
            System.out.println("input String is : " + inputstring  + " , reverse string is : " + reversestring) ;
        }
    }
}
