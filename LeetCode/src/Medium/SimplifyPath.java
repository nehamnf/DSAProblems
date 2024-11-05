package Medium;

import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        System.out.println(simplifyPath("/."));
    }

    public static String simplifyPath(String path) {

        Stack<String> st= new Stack<>();

        String[] str=path.split("/");
        System.out.println(Arrays.toString(str));


        for (String s : str) {
            if (Objects.equals(s, ".")) {
                continue;
            } else if (Objects.equals(s, "..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                if (!Objects.equals(s, "")) {
                    st.push(s);
                }
            }
        }

        StringBuilder result= new StringBuilder();
        for (String dir : st) {
            result.append("/");
            result.append(dir);
        }

        System.out.println(result);
        return !result.isEmpty() ? result.toString() : "/";
    }
}
