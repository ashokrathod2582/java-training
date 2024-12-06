package practice.collectionFramework;

import java.util.Stack;

public class CheckParentheses {

    public static boolean checkParentheses(String str){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else if(c == ')' || c == ']' || c == '}'){
                if(stack.isEmpty()){
                    return false;
                }

                char opening = stack.pop();

                if ((c == ')' && opening != '(') ||
                        (c == ']' && opening != '[') ||
                        (c == '}' && opening != '{')) {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String str1 = "{[()]}";
        String str2 = "(()))";
        String str3 = "({[]})";
        String str4 = "{[}]";

        System.out.println("String 1 is balanced: " + checkParentheses(str1));
        System.out.println("String 2 is balanced: " + checkParentheses(str2));
        System.out.println("String 3 is balanced: " + checkParentheses(str3));
        System.out.println("String 4 is balanced: " + checkParentheses(str4));
    }
}
