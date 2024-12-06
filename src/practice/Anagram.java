package practice;

import java.util.Arrays;

public class Anagram {

    public boolean isAnagram(String a, String b){

        char[] aChar = a.replaceAll("\\s+", "").toLowerCase().toCharArray();
        char[] bChar = b.replaceAll("\\s+","").toLowerCase().toCharArray();

        if(aChar.length != bChar.length){
            System.out.println("length not matching");
            return false;
        }
        Arrays.sort(aChar);
        Arrays.sort(bChar);

        return Arrays.equals(aChar, bChar);
    }

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        String s1 = "Mother tybe";
        String s2 = "rethom byte";

        System.out.println(s1+" and "+s2+" are anagram : "+anagram.isAnagram(s1,s2));
    }
}
