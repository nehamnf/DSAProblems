package Easy;

import java.util.Objects;
import java.util.Stack;

public class MinStrLenAfterRemovingSubstrings {
    public static void main(String[] args) {
        System.out.println(minLength("ACBBD"));
    }
    public static int minLength(String s) {

        Stack<Character> st= new Stack<>();
        for(int i=0;i< s.length();i++){
            char currentChar = s.charAt(i);

            if ((!st.isEmpty()) && ((st.peek() == 'A' && currentChar == 'B') || (st.peek() == 'C' && currentChar == 'D'))) {
                st.pop();
            } else {
                st.push(currentChar);
            }
        }
        System.out.println(st);
        return st.size();
    }

}
