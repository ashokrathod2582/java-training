package practice;

public class Palindrome {

    public boolean isPalindrome(int num){
        int temp = num;
        int r;
        int result = 0;

        while(num>0){
            r = num % 10;
            result = result * 10 + r;
            num = num / 10;
        }
        return result == temp;
    }

    public boolean stringP(String s){
        String reversedString = "";
        for(int i=s.length()-1; i>=0; i--){
            reversedString += s.charAt(i);
        }
        return reversedString.equals(s);
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        int num = 15251;
        boolean isPalindrome = palindrome.isPalindrome(num);
        String s = "madama";
        System.out.println("s: "+palindrome.stringP(s));
        System.out.println(isPalindrome);


    }
}
