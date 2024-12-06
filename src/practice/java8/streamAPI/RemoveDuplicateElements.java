package practice.java8.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ashok","Rathod","Ashok","Rathod");

        List<String> distinctList = list.stream().distinct().collect(Collectors.toList());

        System.out.println(distinctList);
    }
}
