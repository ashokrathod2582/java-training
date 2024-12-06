package practice.java8.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEven {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        List<Integer> oddList = list.stream().filter(i->i%2==1).collect(Collectors.toList());
        List<Integer> evenList = list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("ODD LIST: "+oddList);
        System.out.println("Even List: "+evenList);
    }
}
