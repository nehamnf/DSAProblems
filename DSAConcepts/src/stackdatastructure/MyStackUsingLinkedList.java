package stackdatastructure;

import org.w3c.dom.Node;

public class MyStackUsingLinkedList {
    static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    private int size=0;

    public void push(int value){
        Node newNode=new Node(value);
        if(head == null){
            head=newNode;
            size=size+1;
            return;
        }

        newNode.next=head;
        head=newNode;
        size=size+1;
    }

    public int pop(){
        if(head == null){
            return -1;
        }
        int res=head.data;
        head=head.next;
        size--;
        return res;
    }

    public int peek(){
        if(head == null){
            return -1;
        }
        return head.data;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (head == null);
    }

    public void display(){
        Node tempNode=head;
        while (tempNode != null){
            System.out.print(tempNode.data+" -> ");
            tempNode=tempNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        MyStackUsingLinkedList ml= new MyStackUsingLinkedList();
        ml.push(1);
        ml.push(2);
        ml.push(3);
        ml.display();
        System.out.println(ml.peek());
        System.out.println(ml.pop());
        ml.display();
    }
}
