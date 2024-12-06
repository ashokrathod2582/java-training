package com.polymorphism;

public class MethodOverloading {
    public void print(int a){
        System.out.println(a);
    }
    public void print(int a,int b){
        int c = a + b;
        System.out.println(c);
    }
    public void print(int a, int b, int c){
        int d = a + b + c;
        System.out.println(d);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.print(1);
        obj.print(2,3);
        obj.print(4,5,6);
    }
}
