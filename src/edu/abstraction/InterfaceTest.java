package edu.abstraction;

interface Inter{
    public void sum(int a,int b);
    public void sub(int a,int b);
}
interface Inter2{
    public void mul(int a,int b);
    public void div(int a,int b);
}

public class InterfaceTest implements Inter,Inter2 {
    @Override
    public void sum(int a, int b) {
        int c = a+b;
        System.out.println("Addition is : "+c);
    }

    @Override
    public void sub(int a, int b) {
        int c = a-b;
        System.out.println("Subtraction is : "+c);
    }

    @Override
    public void mul(int a, int b) {
        int c = a*b;
        System.out.println("Multiplication is : "+c);
    }

    @Override
    public void div(int a, int b) {
        int c = a/b;
        System.out.println("Quotient is ;"+c);
    }

    public static void main(String[] args) {
        InterfaceTest obj = new InterfaceTest();
        obj.sum(3,4);
        obj.sub(9,7);
        obj.mul(3,4);
        obj.div(10,3);
    }
}
