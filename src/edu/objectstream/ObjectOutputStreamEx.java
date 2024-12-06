package edu.objectstream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//Serialization
public class ObjectOutputStreamEx {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Ashok";
        emp.age = 21;
        emp.location = "Pune";
        try {
            FileOutputStream fout = new FileOutputStream("emp.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(emp);
            out.flush();
            System.out.println("Serialization is done");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
