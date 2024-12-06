package com.polymorphism;

class Ex{
    public void cal(int a, int b){
        int c = a + b;
        System.out.println("Addition : "+c);
    }
}

class Ex1 extends Ex{
    public void cal(int a,int b){
        super.cal(a, b);
        int c = a - b;
        System.out.println("Subtraction : "+c);
    }
}
public class MethodOverriding extends Ex1 {

    public void cal(int a, int b){
        super.cal(a,b);
        int c = a * b;
        System.out.println("Multiplication : "+c);
    }

    public static void main(String[] args) {
       MethodOverriding obj = new MethodOverriding();
       obj.cal(8,9);
    }
}
