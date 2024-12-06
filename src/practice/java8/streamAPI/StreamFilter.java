package practice.java8.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        System.out.println("before filtering: "+list);

        List list2 = list.stream().filter(i-> i % 2 == 0).collect(Collectors.toList());

        System.out.println("filtering even numbers: "+list2);

    }
}
