package stackdatastructure;

import java.util.ArrayList;
import java.util.Arrays;
import  java.util.Stack;

public class StackDesigner {

    public static Stack<Integer> _push(ArrayList<Integer> arr, int n)
    {
        Stack<Integer> st = new Stack<>();
        for(Integer i: arr){
            st.push(i);
        }

        return st;
    }

    public static void _pop(Stack<Integer>s)
    {

        while (!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }

    public static void insert(Stack<Integer> st, int x)
    {
        // Your code here
        st.push(x);
    }

    //Function to remove top element from stack.
    public static void remove(Stack<Integer> st)
    {
        // Your code here
        if(!st.isEmpty()){
            st.pop();
        }
    }

    //Function to print the top element of stack.
    public static void headOf_Stack(Stack<Integer> st)
    {
        // Your code here
        System.out.println(st.peek());
    }

    //Function to search an element in the stack.
    public static boolean find(Stack<Integer> st, int val)
    {
        // Your code here
        while (!st.isEmpty()){
            if(st.pop() == val){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Stack<Integer> st=_push(new ArrayList<>(Arrays.asList(1,2,3,5,6)),5);
        System.out.println(st);
        _pop(_push(new ArrayList<>(Arrays.asList(1,2,3,5,6)),5));
    }
}
