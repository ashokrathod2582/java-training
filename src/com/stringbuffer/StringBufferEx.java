package com.stringbuffer;

public class StringBufferEx {
    public static void stringBuffer(StringBuffer str, StringBuffer str2){
        str.append(str2);
        System.out.println(str);

        str2.reverse();
        System.out.println(str2);

        System.out.println(str.capacity());

        System.out.println(str.codePointAt(2));

        System.out.println(str.substring(0));
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Ashok");
        StringBuffer str2 = new StringBuffer("Rathod");
       stringBuffer(str,str2);
    }
}
