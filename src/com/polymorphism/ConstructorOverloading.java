package com.polymorphism;

public class ConstructorOverloading {
    ConstructorOverloading(int a, int b){
        int c = a * b;
        System.out.println(c);
    }

    ConstructorOverloading(int a, int b, int c){
        int d = a + b + c;
        System.out.println(d);
    }

    public static void main(String[] args) {
        ConstructorOverloading obj = new ConstructorOverloading(3,9);
        ConstructorOverloading obj1 = new ConstructorOverloading(3,9,6);
    }
}
