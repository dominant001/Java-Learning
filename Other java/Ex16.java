package com.company;

public class Ex16 {
    double calculateprice(boolean isMember, int age, boolean buyMembership) {
        double price;

        if (isMember) {
            if (age > 65) {
                price = 0.0;
            } else {
                price = 3.0;
            }
        }
        if (isMember = false) {
            price = 50.0;
        } else {
            price = 10.0;
        }

        return price;
    }
}