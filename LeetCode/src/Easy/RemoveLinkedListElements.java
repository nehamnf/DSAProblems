package Easy;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        MergeLinkedList l= new MergeLinkedList();
        ListNode list=l.creatList(new int[]{1,1});
        l.printList(list);
        removeElements(list,1);

        ListNode list2=l.creatList(new int[]{1,2,3,4,5});
        l.printList(list);
        removeElements(list2,4);
    }

    public static ListNode removeElements(ListNode head, int val) {
        MergeLinkedList l= new MergeLinkedList();
//        ListNode dummyHead=new ListNode();
//        dummyHead.next=head;
        ListNode prevNode= head;
        ListNode currNode= head;
        System.out.println(currNode);

        while (head != null && head.val == val) {
            head = head.next;
        }

        while (currNode != null){
           if(currNode.val != val) {
               prevNode=currNode;
               currNode=currNode.next;
            }else {
               prevNode.next=currNode.next;
               currNode=currNode.next;
            }
        }

        l.printList(head);
        return head;
    }
}
