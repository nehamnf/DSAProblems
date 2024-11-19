package Easy;

import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;

public class RemoveDuplicatesStack {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }
    public static String removeDuplicates(String s) {

        String[] st = s.split("");
        Stack<String> stack= new Stack<>();
        System.out.println(Arrays.toString(s.split("")));

        for (String string : st) {
            if (!stack.isEmpty() && (Objects.equals(stack.peek(), string))) {
                System.out.println(string);
                stack.pop();
            } else {
                stack.push(string);
            }
        }

        System.out.println(stack);
        StringBuilder sb= new StringBuilder();
        for(String str:stack){
            sb.append(str);
        }
        return sb.toString();
    }
}
