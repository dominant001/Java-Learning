package com.company;

import java.io.*;

public class BufferClassEx {

    public static void main(String[] args)  throws IOException{


        //WRITE INTO FILE BY USING BUFFERED WRITER
        int i;
        FileWriter fileWriter = new FileWriter("D:/link.txt",true);
        BufferedWriter bfW = new BufferedWriter(fileWriter);
        String s = "ANKIT";
        bfW.write(s);
        bfW.close();


       // READ FROM FILE BY USING BUFFERED READER
       int ch;
        FileReader fr = new FileReader("D:/link.txt");
        BufferedReader bfr = new BufferedReader(fr);

       //to read the data of whole file
        while ((ch = bfr.read())!=-1)
        {
            System.out.print((char)ch);
        }


        // or to read a line from the file
        String s1;
        s1 = bfr.readLine();
        System.out.println("line will be : " + s1);


        // read from file as per the requirement
        char []c = new char[20];
        bfr.read(c,2,10);
        System.out.println(c);

        bfr.close();
    }
}
