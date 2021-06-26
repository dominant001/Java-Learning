package com.company;

public class Ex6 {

    static int extra = 500;
    public static int changescore(int score ,Boolean bonus,int extra){
        if (bonus == true){
            score += extra;
        }
        return score;
    }
    public static void main(String[] args){
        Boolean bonus = true;
        int score = 10;
        int newScore = changescore(score,bonus,100);
        System.out.println(score);
        System.out.println(newScore);
    }
}
