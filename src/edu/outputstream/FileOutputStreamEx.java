package edu.outputstream;

import java.io.FileOutputStream;

//Write a Single Char

public class FileOutputStreamEx {
        public static void main(String args[]){
            try{
                FileOutputStream fout=new FileOutputStream("rathod.txt");
                fout.write(65);
                fout.close();
                System.out.println("success...");
            }catch(Exception e){
                System.out.println(e);
            }
        }
}
