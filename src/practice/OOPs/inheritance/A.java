package practice.OOPs.inheritance;

public class A {

    public void print(String name){
        System.out.println("Hello "+name+" welcome to class A print method");
    }
}

class B extends A{
    public void print(String name){
        System.out.println("Hello "+name+" welcome to class B print method");
    }

    public static void main(String[] args) {
        B b = new B();
        b.print("Ashok");
    }
}
