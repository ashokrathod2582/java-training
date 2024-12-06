package com.inheritance;

class Ex{
    public void print(){
        System.out.println("Hello");
    }
}

public class SimpleInheritance extends Ex {
    public void print1(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        SimpleInheritance obj = new SimpleInheritance();
        obj.print();
        obj.print1();
    }
}
