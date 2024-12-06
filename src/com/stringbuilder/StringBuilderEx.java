package com.stringbuilder;

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder str =new StringBuilder("Ashok");
        StringBuilder str2 = new StringBuilder("Rathod");

        str.append(str2);
        System.out.println(str);

        str.append(3);
        System.out.println(str);

        str.append('Z');
        System.out.println(str);

        str.append(false);
        System.out.println(str);

        str.delete(2,5);
        System.out.println(str);

    }
}
