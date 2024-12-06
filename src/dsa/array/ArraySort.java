package dsa.array;

import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
        int[] numbers = {1,2,2,3,27,8,95,44,32,22,1,12};

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}
