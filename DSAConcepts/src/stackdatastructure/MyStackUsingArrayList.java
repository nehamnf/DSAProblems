package stackdatastructure;

import java.util.ArrayList;
import java.util.Arrays;

public class MyStackUsingArrayList {

    private ArrayList<Integer> data;

    public MyStackUsingArrayList(){
        this.data=new ArrayList<>();
    }

    public void push(int value){
        data.add(value);
    }

    public int pop(){
        if(data.isEmpty()){
            System.out.println("Stack if empty");
            return Integer.MIN_VALUE;
        }
        int result=data.get(data.size()-1);
        data.remove(data.size()-1);
        return result;
    }

    public int peek(){
        if(data.isEmpty()){
            System.out.println("Stack if empty");
            return Integer.MIN_VALUE;
        }
        return data.get(data.size()-1);
    }

    public int size(){
        return data.size();
    }

    public boolean isEmpty(){
        return data.isEmpty();
    }
    @Override
    public String toString(){
        return data.toString();
    }

}
