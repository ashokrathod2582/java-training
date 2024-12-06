package java8.streamAPI;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequency {
    public static void main(String[] args) {
        String inputString = "Ashok Rathod";
        Map<Character, Long> map = inputString.chars().mapToObj(c->(char)c).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }
}
