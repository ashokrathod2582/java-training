package practice;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        String firstName;
        String lastName;
        String address;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name");
        firstName = sc.next();
        System.out.println("Enter your lastName");
        lastName = sc.next();
        System.out.println("Enter your Address");
        address = sc.next();

        System.out.println("My Name is "+firstName+" "+lastName+" I am from "+address);

    }
}
