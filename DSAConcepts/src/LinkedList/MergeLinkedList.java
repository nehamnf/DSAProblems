package LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString(){
        return "Node[ val: "+val+" next reference: "+System.identityHashCode(next)+" ]";
    }
}

// class MyLinkedList{
//
//    private ListNode head;
//    public void addNode(int val){
//        ListNode newNode= new ListNode(val);
//        if( head == null){
//            head=newNode;
//            return;
//        }
//
//        ListNode currentNode=head;
//        while (currentNode.next != null){
//            currentNode=currentNode.next;
//        }
//        currentNode.next=newNode;
//    }
//
//    public ListNode getHead() {
//        return head;
//    }
//
//    public void printList(){
//        ListNode currentNode=head;
//        while (currentNode != null){
//            System.out.print(currentNode.val+"->");
//            currentNode=currentNode.next;
//        }
//        System.out.println("null");
//    }
// }
public class MergeLinkedList {

    public static void main(String[] args) {
//        MyLinkedList l1= new MyLinkedList();
//        l1.addNode(1);
//        l1.addNode(2);
//        l1.addNode(4);
//        l1.printList();
//        System.out.println(l1.getHead());
//
//        MyLinkedList l2= new MyLinkedList();
//        l2.addNode(1);
//        l2.addNode(3);
//        l2.addNode(4);
//        l2.printList();
//        System.out.println(l2.getHead());


    }

    public static void mergeTwoLists(ListNode list1, ListNode list2) {


    }
}
