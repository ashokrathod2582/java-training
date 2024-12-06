package edu.filehandelling;

import java.io.File;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File obj = new File("ashok.txt");
            if (obj.createNewFile()) {
                System.out.println("file is Created : "+obj.getName());
            }
            else {
                System.out.println("file already exists");
            }
        }catch (Exception e){
            System.out.println("Exception occurred : "+e);
        }
    }
}
