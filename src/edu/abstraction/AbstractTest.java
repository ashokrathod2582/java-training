package edu.abstraction;

abstract class AbstractEx{
    public abstract void sum(int a, int b);
    public void sub(int a,int b){
        int c = a - b;
        System.out.println("Subtraction is : "+c);
    }

}

public class AbstractTest extends AbstractEx {

    @Override
    public void sum(int a, int b) {
        int c = a+b;
        System.out.println("Addition is : "+c);
    }

    public static void main(String[] args) {
        AbstractTest obj = new AbstractTest();
        obj.sum(8,9);
        obj.sub(9,8);
    }
}
