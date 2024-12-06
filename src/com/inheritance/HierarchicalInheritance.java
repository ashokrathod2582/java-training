package com.inheritance;

import com.sun.org.apache.xalan.internal.xsltc.trax.XSLTCSource;

class Ex3{
    public void print(){
        System.out.println("Method of Class Ex3");
    }
}

class Ex4 extends Ex3 {
    public void print(){
        super.print();
        System.out.println("Method of Class Ex4");
    }
}

class Ex5 extends Ex3{
    public void print(){
        super.print();
        System.out.println("Method of Class Ex5");
    }
}
public class HierarchicalInheritance extends Ex3 {
         public void print(){
             super.print();
             System.out.println("Method of Class HierarchicalInheritance");
         }

    public static void main(String[] args) {
        Ex4 obj = new Ex4();
        obj.print();
        Ex5 obj2 = new Ex5();
        obj2.print();
        HierarchicalInheritance obj3 = new HierarchicalInheritance();
        obj3.print();
    }
}
