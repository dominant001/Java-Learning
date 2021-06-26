package com.company;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a degree in celcius");;

        double celsius = sc.nextInt();
        double farenhite = 1.8 * celsius + 32;

        System.out.println(celsius + " Celsius Is " + farenhite + " Farenhite is");


    }
}
