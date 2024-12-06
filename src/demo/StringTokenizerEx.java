package demo;

import java.util.StringTokenizer;

public class StringTokenizerEx {

    public static void main(String[] args) {
        String name = "AB:AC:AD";
        StringTokenizer tokenizer = new StringTokenizer(name,":");
        String a = tokenizer.nextToken();
        String b = tokenizer.nextToken();
        String c = tokenizer.nextToken();
//        String d = tokenizer.nextToken();
        System.out.println(a+b+c);
    }
}
