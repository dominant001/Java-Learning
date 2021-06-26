package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TCSEx {

    public static void main(String[] args) {
    Data d = new Data();
     d.adddata();


    }
}


class  Data{

    public void adddata(){
        float R[] = {42.195f, 42.195f, 42.195f, 33.25f, 40, 41.2f, 38.9f, 37.5f};
        final float dis = 42.195f;
        float first, second, third;
        float arr[] = new float[3];

        /* There should be atleast three elements */




        third = first = second = 0;
        for (int i = 0; i < R.length; i++) {
            /* If current element is greater than
            first*/
            if (R[i] > first && R[i]<dis) {
                third = second;
                second = first;
                first = R[i];

            }

            /* If arr[i] is in between first and
            second then update second  */
            else if (R[i] > second && R[i]<dis) {
                third = second;
                second = R[i];

            }

            else if (R[i] > third && R[i]<dis)
                third = R[i];

        }

        arr[0]=first;
        arr[1] = second;
        arr[2] = third;
        System.out.println("Three largest elements are " + first + " " + second + " " + third);
        for(int i =0;i<3;i++){
            System.out.println(arr[i]);
        }

    }
}







//