package Medium;

public class DeleteMiddleNodeOfLL {
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

    private void printList(ListNode listNode){
       ListNode current = listNode;
        while (current != null){
            System.out.print(current.val+" -> ");
            current=current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DeleteMiddleNodeOfLL dl= new DeleteMiddleNodeOfLL();
        int[] arr=new int[]{1,3,4,7,1,2,6};
        ListNode list1=dl.createList(arr);
        dl.printList(list1);
        dl.deleteMiddle(list1);
    }
    public  ListNode deleteMiddle(ListNode head) {

        ListNode slow=head;
        ListNode fast=head;

        if(head ==  null || head.next ==  null){
            head=null;
            return head;
        }

        if(head.next.next == null){
            head.next=null;
            return head;
        }

        while (fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }

        System.out.println(slow);
        slow.val=slow.next.val;
        slow.next=slow.next.next;

        printList(head);

        return head;

    }

}
