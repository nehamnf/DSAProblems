package stackdatastructure;

import java.util.NoSuchElementException;
import java.util.Stack;

public class DeleteMidOfStack {
    public static void deleteMid(Stack<Integer> st, int sizeOfStack) {
        // code here
        int size = st.size();
        if (size == 0) {
            throw new NoSuchElementException("Stack is empty");
        }

        // Calculate the 1-based middle index from the bottom
        int middleIndexFromBottom = (size +1 ) / 2;

        int indexFromTop = size - middleIndexFromBottom;

        st.remove(indexFromTop);

        System.out.println(st);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        deleteMid(st,5);
//        System.out.println(st);
//        System.out.println(st.remove(3));
//        System.out.println(st);
//        deleteMid(st,5);
    }
}
