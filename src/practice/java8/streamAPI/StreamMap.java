package practice.java8.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,5,6,3,7,8,9);
        List list1 = list.stream().map(s->s*s).collect(Collectors.toList());
        System.out.println(list1);
    }
}
