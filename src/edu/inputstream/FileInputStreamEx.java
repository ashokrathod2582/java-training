package edu.inputstream;

import java.io.FileInputStream;

//Read a single Character

public class  FileInputStreamEx{
    public static void main(String args[]){
        try{
            FileInputStream fin=new FileInputStream("rathod.txt");
            int i=fin.read();
            System.out.print((char)i);

            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}