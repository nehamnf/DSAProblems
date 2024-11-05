package LinkedList;

public class CircularLinkedList {

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
        @Override
        public String toString() {
            return "Node[ val: " + data + ", address: " + System.identityHashCode(this) +
                    ", next: " + (next != null ? System.identityHashCode(next) : "null") + " ]";
        }
    }

    private static Node head;
    private static Node tail;

    public void addNodeFirst(int val){
        Node newNode= new Node(val);
        if(head ==null){
            head=newNode;
            tail=newNode;
            newNode.next=head;
            return;
        }

        newNode.next=head;
        head=newNode;
        tail.next=head;
        System.out.println(head);
    }

    public void addNodeLast(int val){
        Node newNode= new Node(val);
        if(head ==null){
            head=newNode;
            tail=newNode;
            newNode.next=head;
        }else{
            tail.next=newNode;
            tail=newNode;
            tail.next=head;
        }
    }

    public void printClList(){
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node tempNode=head;
        do{
            System.out.print(tempNode.data+" -> ");
            tempNode=tempNode.next;
        }while (tempNode != head);

        System.out.println("null");
    }

    public void insertSpecificPostion(int pos,int val){
        Node newNode=new Node(val);

        if (pos < 1) {
            System.out.println("Position must be 1 or greater.");
            return;
        }

        // Case 1: Insert at position 1 (before the head)
        if (pos == 1) {
            if (head == null) {
                head = newNode;
                tail = head;
                newNode.next = head; // Circular linkage
            } else {
                newNode.next = head;
                head = newNode;
                tail.next = head;  // Maintain circular structure
            }
            return;
        }

        // Case 2: Insert at any other position
        Node tempNode=head;
        for(int i=0;i < pos-1;i++){
            tempNode=tempNode.next;
        }
        newNode.next=tempNode.next;
        tempNode.next=newNode;

        // If inserted at the end, update the tail
        if (tempNode == tail) {
            System.out.println(tempNode);
            tail = newNode;
        }

    }

    public void deleteFirst(){

        if(head == null ){
            System.out.println("List is empty so cannot delete");
            return;
        }

        if(head == tail){
            head=null;
            tail=null;
            return;
        }

        head=head.next;
        tail.next=head;

    }


    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty, cannot delete.");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != tail) {
            currentNode = currentNode.next;
        }

        currentNode.next = head;
        tail = currentNode;
    }

    public void deleteAtSpecificPosition(int pos){
        if (pos < 1) {
            System.out.println("Position must be 1 or greater.");
            return;
        }

        if(pos == 1){
            if(head == null){
                System.out.println("List is empty to delete");
            }// If there's only one node
            if (head == tail) {
                head = null; // List becomes empty
                tail = null;
            } else {
                head = head.next; // Move head to next node
                tail.next = head; // Maintain circular structure
            }
            return;
        }

        Node currNode=head;
        Node preNode=head;
        for(int i=0;i < pos -1;i++){
            preNode=currNode;
            currNode=currNode.next;

            // If we reach back to head before position, it means position is invalid
            if (currNode == head) {
                System.out.println("Position exceeds the length of the list.");
                return;
            }
        }
        preNode.next=currNode.next;
    }

    public static void main(String[] args) {
        CircularLinkedList cl= new CircularLinkedList();

        //insert at first node
        cl.addNodeFirst(1);
        cl.addNodeFirst(2);
        cl.printClList();

        //insert at last node
        cl.addNodeLast(3);
        cl.printClList();

        //insert at specific position
        cl.insertSpecificPostion(2,4);
        cl.printClList();
        cl.insertSpecificPostion(4,6);
        cl.printClList();

        //delete from first of linked list
        cl.deleteFirst();
        cl.printClList();

        //delete from last
        cl.deleteLast();
        cl.printClList();

        //delete at specific position
        cl.deleteAtSpecificPosition(5);
        cl.printClList();

    }
}
