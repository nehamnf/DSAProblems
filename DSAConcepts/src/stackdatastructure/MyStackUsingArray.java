package stackdatastructure;

import java.util.Arrays;

public class MyStackUsingArray {

    private int size;
    private int top;
    private int[] data;

    public MyStackUsingArray(int size) {
        this.size = size;
        this.top=-1;
        this.data=new int[size];
    }

    public void push(int value){
        if(top == (size-1)){
            System.out.println("Stack if full");
            return;
        }
        top=top+1;
        data[top]=value;
    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return data[top--];
    }

    public int size(){
        return top+1;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public int peek(){
        if(top == -1){
            System.out.println("Stack if empty");
            return Integer.MIN_VALUE;
        }
        return data[top];
    }

    @Override
    public String toString(){
        return Arrays.toString(Arrays.copyOfRange(data, 0, top + 1));
    }
}
