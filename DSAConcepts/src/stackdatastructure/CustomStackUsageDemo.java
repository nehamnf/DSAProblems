package stackdatastructure;

public class CustomStackUsageDemo {
    public static void main(String[] args) {


        //stack demo where stack uses arrays
        MyStackUsingArray myStackUsingArray=new MyStackUsingArray(5);
        myStackUsingArray.push(1);
        myStackUsingArray.push(2);
        System.out.println(myStackUsingArray);
        System.out.println(myStackUsingArray.peek());
        System.out.println(myStackUsingArray.pop());
        myStackUsingArray.push(3);
        System.out.println(myStackUsingArray);

        //stack demo where stack using arraylist
        MyStackUsingArrayList myStackUsingArrayList=new MyStackUsingArrayList();
        myStackUsingArrayList.push(1);
        myStackUsingArrayList.push(2);
        System.out.println(myStackUsingArrayList);
        System.out.println(myStackUsingArrayList.peek());
    }
}
