package com.polymorphism;

class A{
    public void helloWorld(){
        System.out.println("Hello World1");
    }
}

class B extends A{
    public void helloWorld(){
        System.out.println("Hello World2");
    }
}

public class MethodOverriding2 extends B{

    public void helloWorld(){
        System.out.println("Hello World3");
    }

    public static void main(String[] args) {
        MethodOverriding2 method = new MethodOverriding2();
        method.helloWorld();
    }
}
