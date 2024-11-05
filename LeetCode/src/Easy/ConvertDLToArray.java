package Easy;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertDLToArray {

    private class Node {
        public int val;
        public Node prev;
        public Node next;

        public Node(int val) {
            this.val = val;
            this.prev=null;
            this.next=null;
        }

        @Override
        public String toString() {
            return "CurrentNode: "+System.identityHashCode(this)+" Node{" +
                    "data=" + val +
                    ", next=" + System.identityHashCode(next) +
                    ", prev=" + System.identityHashCode(prev) +
                    '}';
        }

    }

    private Node head=null;
    private Node tail=null;

    public Node addLast(int data){
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
            tail=newNode;
        }else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        return head;
    }

    public void printList(Node head){
        if (head == null){
            System.out.println("Doubly Linked list empty");
            return;
        }

        Node currNode=head;
        while (currNode != null){
//            System.out.println(currNode);
            System.out.print(currNode.val+" -> ");
            currNode=currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ConvertDLToArray cl= new ConvertDLToArray();
        cl.addLast(1);
        cl.addLast(2);
        cl.addLast(3);
        Node head =cl.addLast(4);
        cl.printList(head);
        cl.toArray(head);
    }

    public int[] toArray(Node head) {

        ArrayList<Integer> arr= new ArrayList<>();
        Node currNode= head;
        while (currNode != null){
            arr.add(currNode.val);
            currNode=currNode.next;
        }

        System.out.println(arr);
        int[] result=new int[arr.size()];

        for(int i=0;i< arr.size();i++){
            result[i]=arr.get(i);
        }

        System.out.println(Arrays.toString(result));
        return result;
    }
}
