package edu.objectstream;


import java.io.FileInputStream;
import java.io.ObjectInputStream;

//Deserialization
public class ObjectInputStreamEx {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("emp.txt");
            ObjectInputStream oin = new ObjectInputStream(fin);
            Object o = oin.readObject();
            Employee emp = (Employee)o;
            System.out.println("Name : "+emp.name);
            System.out.println("Age : "+emp.age);
            System.out.println("Location : "+emp.location);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
