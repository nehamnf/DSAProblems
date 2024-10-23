package Easy;

public class RemoveDuplicates {
    public static void main(String[] args) {
        MergeLinkedList l= new MergeLinkedList();
        ListNode list=l.creatList(new int[]{1,1,3,3,3,3,4,4,4,5});
        l.printList(list);
        deleteDuplicates(list);
    }

    public static ListNode deleteDuplicates(ListNode head) {

        MergeLinkedList l= new MergeLinkedList();
        ListNode prevNode=head;
        ListNode curr=head;
        while (curr!= null){
            if(curr.val != prevNode.val){
                prevNode=curr;
                curr=curr.next;
            }else{
                curr=curr.next;
                prevNode.next=curr;
            }
        }
        l.printList(head);
        return new ListNode();
    }
}
