package practice;

public class StaticEx {
    private static int x = 0;
    private int y = 0;

    public static void main(String[] args) {
        StaticEx one = new StaticEx();
        one.x = 10;
        one.y = 20;

        StaticEx two = new StaticEx();
        two.x = 30;
        two.y = 40;

        System.out.println(one.x);
        System.out.println(one.y);
        System.out.println(two.x);
        System.out.println(two.y);
    }
}
