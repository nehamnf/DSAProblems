package LinkedList;

class Node {
    String data;
    Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }
}


public class LinkedListDemo {
    private static int size;
    static class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }

        @Override
        public String toString() {
            return "node address LinkedList.Node@" + Integer.toHexString(System.identityHashCode(this)) +
                    " {data='" + data + '\'' +
                    ", Next LinkedList.Node address=" + (next != null ? "LinkedList.Node@" + Integer.toHexString(System.identityHashCode(next)) : "null") +
                    '}';
        }


    }

    Node head=null;

    public void addFirst(String data){
        Node newNode= new Node(data);
        if(head == null){
            head=newNode;
            System.out.println(newNode);
            System.out.println(head);
            return;
        }
        newNode.next=head;
        System.out.println("NewNode: "+newNode);
        head=newNode;
    }

    public void addLast(String data){
        Node newNode= new Node(data);
        if(head == null){
            head=newNode;
            System.out.println(newNode);
            System.out.println(head);
            return;
        }

        Node currentNode= head;
        while (currentNode.next != null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
        System.out.println(currentNode);
    }

    public void printList(){

        if(head == null){
            System.out.println("List is empty");
        }

        Node currentNode= head;
        while (currentNode != null){
            System.out.print(currentNode.data +"->");
            currentNode=currentNode.next;
        }
        System.out.println("null");
    }

    public void deleteFirst(){

        if(head == null){
            System.out.println("List is empty");
            return;
        }

        size--;
        Node currentNode=head;
        head=currentNode.next;
    }

    public int getSize(){
        return size;
    }

    public void deleteLast(){

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        size--;
        // If there is only one node
        if (head.next == null) {
            head = null;  // Make the list empty
            System.out.println("Deleted last remaining node.");
            return;
        }

        // Traverse the list to find the second-to-last node
        Node currentNode = head;
        Node prevNode = null;

        while (currentNode.next != null) {
            prevNode = currentNode;
            currentNode = currentNode.next;
        }

        // The previous node's next is set to null, removing the last node
        prevNode.next = null;
        System.out.println("Deleted last node: " + currentNode);
    }
    public static void main(String[] args) {

        LinkedListDemo l= new LinkedListDemo();

        System.out.println(l.head);
        l.addFirst("mn");
        l.addFirst("neha");
        l.addFirst("Hello");
        l.addLast("Welcome");
        l.printList();

        l.deleteFirst();
        l.printList();

        l.deleteLast();
        l.printList();

        System.out.println(l.getSize());
        l.deleteLast();
        System.out.println(l.getSize());
    }
}
