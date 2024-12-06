package practice.java8;

import java.util.function.Supplier;

public class SupplierEx {

    public static void main(String[] args) {
        Supplier<Integer> randomInt = ()-> (int) (Math.random()*100);

        int number = randomInt.get();

        System.out.println(number);

        Supplier<String> defaultValue = () -> "Default Value";

        String valueString = defaultValue.get();
        System.out.println(valueString);
    }
}
