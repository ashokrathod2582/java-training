package java8.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ElementFrequency {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Pen","Pencil","Paper","Pencil","Paper","Notebook");
        Map<String, Long> map = list.stream().
                collect(Collectors.groupingBy(
                        Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
}
