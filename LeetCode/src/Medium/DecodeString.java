package Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
//        decodeString("2[aa]b");

//        decodeString("3[a2[c]]");
        System.out.println(decodeString("3[a2[c]]"));
        System.out.println(decodeString("10[abc]3[cd]ef"));
    }

    public static String decodeString(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ']') {
                List<Character> decodedString = new ArrayList<>();

                while (stack.peek() != '[') {
                    decodedString.add(stack.pop());
                }

                stack.pop();

                int base = 1;
                int k = 0;

                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    k = k + (stack.pop() - '0') * base;
                    base *= 10;
                }
                while (k != 0) {
                    for (int j = decodedString.size() - 1; j >= 0; j--) {
                        stack.push(decodedString.get(j));
                    }
                    k--;
                }
            } else {
                stack.push(s.charAt(i));
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.reverse().toString();
    }
}
