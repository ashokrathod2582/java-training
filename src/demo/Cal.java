package demo;

public class Cal {
    public static void main(String[] args) {
        String custNum = "6150701800";
        long value1 = Long.parseLong(custNum);
        System.out.println(Long.toString(value1*13-7));
    }
}
