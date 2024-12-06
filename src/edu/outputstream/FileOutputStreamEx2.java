package edu.outputstream;

import java.io.FileOutputStream;

//Write a String

public class FileOutputStreamEx2 {
    public static void main(String args[]){
        try{
            FileOutputStream fout=new FileOutputStream("nabla.txt");
            String s="Nabla Infotech is a young and rapidly expanding IT consulting and service company.";
            byte b[]=s.getBytes();//converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("success...");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
