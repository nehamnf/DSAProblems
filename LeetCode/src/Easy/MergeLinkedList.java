package Easy;

import org.w3c.dom.Node;

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
    public String toString() {
        return "Node[ val: " + val + ", address: " + System.identityHashCode(this) +
                ", next: " + (next != null ? System.identityHashCode(next) : "null") + " ]";
    }
 }


public class MergeLinkedList {
    private ListNode head;
    public  ListNode creatList(int[] values){
        if(values.length ==0 ){
            return null;
        }

        head=new ListNode(values[0]);
        ListNode currentNode=head;

        for(int i=1;i < values.length;i++){
            currentNode.next= new ListNode(values[i]);
            currentNode=currentNode.next;
        }

        return head;
    }

    public void printList(ListNode listNode){
        ListNode current = listNode;
        while (current != null){
            System.out.print(current.val+" -> ");
            current=current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MergeLinkedList l= new MergeLinkedList();

        int[] arr=new int[]{1,2,4};
        int[] arr2=new int[]{1,3,5};
        ListNode list1=l.creatList(arr);
        l.printList(list1);
        ListNode list2=l.creatList(arr2);
        l.printList(list2);

        mergeTwoListsUsingExtraList(list1,list2);
    }

    public static void mergeTwoListsUsingExtraList(ListNode list1, ListNode list2) {
        MergeLinkedList l= new MergeLinkedList();

        System.out.println("Starting merge...");
        System.out.println("Initial list1: " + list1);
        System.out.println("Initial list2: " + list2);

        ListNode resultHead= new ListNode(-1);
        ListNode current=resultHead;
        System.out.println("initial resultHead: "+resultHead);
        System.out.println("initial current: "+current);

        while (list1 != null && list2 != null){
            if(list1.val >= list2.val){
                System.out.print("Attaching list2 node: " + list2 );
                current.next=list2;
                list2=list2.next;
                System.out.println(" to result: "+resultHead +" current :"+current);
            }else {
                System.out.print("Attaching list1 node: " + list1 );
                current.next=list1;
                list1=list1.next;
                System.out.println(" to result: "+resultHead +" current :"+current);
            }
            current=current.next;
            System.out.println("Current node pointing to now: ==="+current);
        }

        if(list1 != null){
            System.out.println("Attaching remaining list1 nodes starting from: " + list1);
            current.next=list1;
        }else if(list2 != null){
            System.out.println("Attaching remaining list2 nodes starting from: " + list2);
            current.next=list2;
        }
        l.printList(list1);
        l.printList(list2);
        l.printList(resultHead);

    }
}
