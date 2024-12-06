package practice.collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);

        System.out.println("Before sort: "+list);

        Set<Integer> set = new HashSet<>(list);

        System.out.println("After sort: "+set);
    }
}
