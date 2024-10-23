package Easy;

public class ReverseLinkedList {

    public static void main(String[] args) {
        MergeLinkedList l= new MergeLinkedList();
        ListNode list=l.creatList(new int[]{1,2,3,4,5});
        l.printList(list);
        reverseList(list);
    }
    public static ListNode reverseList(ListNode head) {

        ListNode curr=head;
        ListNode prevNode=null;
        MergeLinkedList l= new MergeLinkedList();

        while (curr != null){
            ListNode tempNode=curr.next;
            curr.next=prevNode;
            prevNode=curr;
            curr=tempNode;
        }

        l.printList(prevNode);
        return prevNode;
    }
}
