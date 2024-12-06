package dsa;

public class A{
    public static void main(String[] args) {
        B b = new B();
        b.printHello();
    }
}


 final class B {
    void printHello(){
        System.out.println("Hello");
    }
}