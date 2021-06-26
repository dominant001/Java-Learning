package com.company;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileClsEx {

    public static void main(String[] args) throws IOException {
        int i;
        File f1 = new File("D:/link.txt");
        f1.createNewFile();
        System.out.println("is file exist :" + f1.exists() );
        System.out.println(f1.length());
        //f1.delete();

        //WRITE INTO FILE BY USING FILEOUTPUTSTREAM
        FileOutputStream fout;
        fout = new FileOutputStream(f1,true);

        String s = "ANKIT";

        char ch[] = s.toCharArray();
        for (i=0;i<  s.length();i++)
        {
          fout.write(ch[i]);
        }
        fout.close();



        // READ FROM FILE BY USING FILEINPUTSTREAM

        FileInputStream fin;
        fin = new FileInputStream(f1);

        do {
            i = fin.read();
            if (i!=-1){
                System.out.print((char)i);
            }
        }while (i!=-1);
        fin.close();


    }
}
