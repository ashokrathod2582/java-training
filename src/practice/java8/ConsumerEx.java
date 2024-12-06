package practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ashok","Rahul","Sachin");

//        names.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s.toUpperCase());
//            }
//        });

        names.forEach(s-> System.out.println(s.toUpperCase()));
    }
}
