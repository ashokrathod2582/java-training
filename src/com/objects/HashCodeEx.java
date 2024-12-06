package com.objects;

public class HashCodeEx {
    public static void main(String[] args) {

        //String literal
        String str = "Ashok";
        String str1 = "Rathod";
        int a = str.hashCode();
        int b = str1.hashCode();
        System.out.println("Hashcode of str is: "+a);
        System.out.println("Hashcode of str2 is : "+b);
        System.out.println("Comparing objects str and str1 : "+str.equals(str1));
        System.out.println(str==str1);

        //New Keyword
        String str2 = new String("Ashok");
        String str3 = new String("Ashok");
        int c = str2.hashCode();
        int d = str3.hashCode();
        System.out.println(c);
        System.out.println(d);
        System.out.println(str2.equals(str3));
        System.out.println(str2==str3);


    }
}
