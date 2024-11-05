package Stack;

import java.util.ArrayList;
import java.util.List;

class Stack {
    private int top;
    private List<Integer> data;
    private int size;

    public Stack(int size) {
        this.top = -1;
        this.data= new ArrayList<>(size);
        this.size=size;
    }

    public void push(int value){
        System.out.println("Top: "+top+" size: "+size);
        if(top == size-1){
            System.out.println("Stack is full");
            return;
        }
        top++;
        data.add(top,value);
    }

    public void pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }
        data.remove(top);
        top--;
    }

    public void display(){
        for (Integer i:data){
            System.out.println(i);
        }
    }
}

public class StackDemo{

    public static void main(String[] args) {
        Stack st= new Stack(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.display();
        st.pop();
        System.out.println("-------------------------");
        st.display();
    }
}

