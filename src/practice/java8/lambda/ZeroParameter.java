package practice.java8.lambda;

@FunctionalInterface
interface Test{
//    void print();
    void sum(int a, int b);
}

public class ZeroParameter {

    static void fun(Test t){
        t.sum(5, 5);
    }

    public static void main(String[] args) {
        fun((a,b) -> System.out.println(a*b));
    }
}
