package Easy;

import java.util.Stack;

public class CrawlerLogFolder {
    public static void main(String[] args) {
        System.out.println(minOperations(new String[]{"d1/","d2/","../","d21/","./"}));
    }

    public static int minOperations(String[] logs) {

        Stack<String> st= new Stack<>();

        for (String log : logs) {
            System.out.println(log);
            if (log.equals("../")) {
                if(!st.isEmpty()) {
                    st.pop();
                }
            } else if (log.equals( "./")) {
                continue;
            } else {
                st.push(log);
            }
        }
        System.out.println(st);
        return st.size();
    }
}
