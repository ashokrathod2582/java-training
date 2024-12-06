package practice.collectionFramework;

import java.util.Stack;

public class StackEx {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Ashok");
        stack.push("Amol");
        stack.push("Kiran");

        System.out.println(stack);
        System.out.println("Select: "+stack.peek());
        System.out.println("Remove: "+stack.pop());
    }
}
