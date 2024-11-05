package Medium;

import Easy.ConvertDLToArray;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertDLToArray_2 {

    private static class Node {
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

    public static void printList(Node head){
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
        Node head = new Node(1);         // Create the head node
        head.next = new Node(2);          // Create and link the second node
        head.next.prev = head;            // Set previous link for the second node
        head.next.next = new Node(3);     // Create and link the third node
        head.next.next.prev = head.next;
        head.next.next.next=new Node(4);
        head.next.next.next.prev=head.next.next;
        toArray(head.next.next.next);
    }

    public static int[] toArray(Node node) {

        Node head=null;

        if(node == null){
            return new int[0];
        }

        while (node.prev != null){
            node=node.prev;
        }
        printList(node);

        ArrayList<Integer> arr= new ArrayList<>();
        Node currNode= node;
        while (currNode != null){
            arr.add(currNode.val);
            currNode=currNode.next;
        }

        int[] result=new int[arr.size()];

        for(int i=0;i< arr.size();i++){
            result[i]=arr.get(i);
        }

        System.out.println(Arrays.toString(result));
        return result;
    }
}
