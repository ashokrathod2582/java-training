package com.inheritance;

class Ex1{
    int a = 10;
}

class Ex2 extends Ex1{
    int a = 20;
}

public class MultilevelInheritance extends Ex2{
    int a = 30;

    public void print(){
        int a = 40;
        System.out.println("Method Variable : "+a);
        System.out.println("Current Class Variable : "+this.a);
        System.out.println("Super Class Variable : "+super.a);
        Ex1 obj = new Ex1();
        System.out.println("Ex1 class Variable "+obj.a);
    }

    public static void main(String[] args) {
        MultilevelInheritance obj1 = new MultilevelInheritance();
        obj1.print();
    }
}
