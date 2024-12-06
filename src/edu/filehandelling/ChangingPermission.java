package edu.filehandelling;

import java.io.File;

public class ChangingPermission {
    public static void main(String[] args) {
        File obj = new File("ashok.txt");
        boolean exists = obj.exists();
        if(exists == true){
            obj.setReadable(true);
            obj.setWritable(false);
            System.out.println("Readable : "+obj.canRead());
            System.out.println("Writable : "+obj.canWrite());
        }
    }

}
