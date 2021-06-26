package com.company;

import java.io.IOException;

public class catchedExceptionEx {

    public static void main(String[] args) {
// we may solve this exception by using try catch or using throws along with method
// where exception has raised like main method

        try {
            throw new IOException();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
