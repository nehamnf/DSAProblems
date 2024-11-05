package LinkedList;

public class DoublyLinkedListDemo {

    private class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        @Override
        public String toString() {
            return "CurrentNode: "+System.identityHashCode(this)+" Node{" +
                    "data=" + data +
                    ", next=" + System.identityHashCode(next) +
                    ", prev=" + System.identityHashCode(prev) +
                    '}';
        }
    }

    private Node head=null;
    private Node tail=null;

    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
            tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    public void printList(){
        if (head == null){
            System.out.println("Doubly Linked list empty");
            return;
        }

        Node currNode=head;
        while (currNode != null){
//            System.out.println(currNode);
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("null");
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
            tail=newNode;
            return;
        }

        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;

    }

    public void addAtSpecificPosition(int pos,int data){
        Node newNode= new Node(data);
        if(pos <= 0){
            System.out.println("Please enter the correct Position ");
            return;
        }

        if(pos == 1){
            if(head == null){
                head=newNode;
                tail=newNode;
            }else{
                newNode.next=head;
                newNode.prev=head;
                head=newNode;
            }
            return;
        }

        Node currNode=head;
        for(int i=1;i < (pos-1);i++){

            if(currNode == tail){
                currNode.next=newNode;
                newNode.prev=currNode;
                tail=newNode;
                return;
            }
            currNode=currNode.next;
        }

        newNode.next=currNode.next;
        newNode.prev=currNode;
        currNode.next=newNode;

    }
    public static void main(String[] args) {

        DoublyLinkedListDemo dl= new DoublyLinkedListDemo();
        dl.addFirst(1);
        dl.addFirst(2);
        dl.printList();

        dl.addLast(3);
        dl.printList();

        dl.addAtSpecificPosition(4,5);
        dl.addAtSpecificPosition(5,10);
        dl.addAtSpecificPosition(2,16);
        dl.addAtSpecificPosition(3,20);
        dl.printList();
    }
}
