package Medium;

public class RemoveNthNodeList {

    private class ListNode {
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

    private ListNode head;
    private ListNode createList(int[] values){
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
        RemoveNthNodeList dl= new RemoveNthNodeList();
        int[] arr=new int[]{2,4,3,5,6,7};
        ListNode list1=dl.createList(arr);
        dl.printList(list1);
        dl.removeNthFromEnd(list1,6);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode first=dummy;
        ListNode second=dummy;

        for(int i=1;i <= n+1;i++){
            first=first.next;
        }

        while (first != null){
            first= first.next;
            second=second.next;
        }
        second.next=second.next.next;
        printList(dummy.next);
        return  dummy.next;
    }

}
