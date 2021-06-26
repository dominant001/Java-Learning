package com.company;

public class new1 {


    public static void main(String[] args) {

        //paliendrome
//        int no = 133;
//        int rev = 0;
//        int nos = no;
//        while (no != 0) {
//            rev = (rev + (no % 10)) * 10;
//            no = no / 10;
//        }
//        rev = rev / 10;
//        if (nos == rev){
//            System.out.println("p");
//        }
//        else {
//            System.out.println("n");
//        }
//    }

        //chicken rabbit program
//        int head = 150;
//        int legs = 500;
//        int count = legs / 4;
//        int headchicken;
//        int headrabbit;
//        if(legs%2==0) {
//            if (count == 1) {
//                 headchicken = (head - count);
//                 headrabbit = head - headchicken;
//                System.out.println("chickens is : " + headchicken);
//                System.out.println("Rabbit is : " + headrabbit);
//            } else {
//                 headchicken = (head - count) * 2;
//                 headrabbit = head - headchicken;
//                System.out.println("chickens is : " + headchicken);
//                System.out.println("Rabbit is : " + headrabbit);
//            }
//        }
//        else{
//            System.out.println("the numbers of chicken and rabbit not found ");
//        }


//        int num1 = 28;
//        int num2 = 36;
//        int num3 = 0;
//        if (~(num2 / num1) < 0 && (num1 + num2) % 4 == 0) {
//            num1 = num1 + --num3;
//        }
//        if ((num2 / num1) > 1 || num3 == 0) {
//            num1 = num1 + num3++;
//            System.out.println(num1 + --num3);
//        } else {
//            System.out.println(num1 + --num3);
//        }

//        int a = 0;
//        if(~(36/28)<0){
//            System.out.println("y");
//        }else {
//            System.out.println("N");
//        }

//        if(-0==0){
//            System.out.println("y");
//        }else {
//            System.out.println("N");
//
//        }


//        int num1 = -20;
//        int num2 = -30;
//        int num3 = 10;
//        int num4 = -40;
//        if (num1 + num2 >= num4) {
//            if (num4 < num3) {
//                if (num4 % num3 != 0) {
//                    System.out.println(1);
//                } else {
//                    System.out.println(2);
//                }
//            }
//        } else {
//            if (num2 / num1 > 0) {
//                if (num1 < num2 || num4 % num3 == 0) {
//                    System.out.println(3);
//                } else {
//                    System.out.println(4);
//                }
//            }
//        }


//        int num1 = 2, num2 = 20 ;
//        do {
//            num2 = num2 / num1;
//            if (num1 > num2) {
//                break;
//            }
//            num2--;
//
//        } while (++num1 < 5);
//
//        System.out.println("num1 = " + num1 + " and num2 = " + num2);



        int sum = 0;
        for (int i = 2; i < 8; i += 2) {
            for (int j = 8; j > i; j -= 2) {
                if (i >= j / 2) {
                    continue;
                } else {
                    sum += i + j;

                }
            }
        }
        System.out.println("Sum = " + sum);
    }
}
