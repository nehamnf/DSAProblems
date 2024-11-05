package Medium;



public class AddTwoList {

    private static class ListNode {
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
    private static ListNode head;
    private static ListNode createList(int[] values){
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

    public static void printList(ListNode listNode){
        ListNode current = listNode;
        while (current != null){
            System.out.print(current.val+" -> ");
            current=current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {


        int[] arr=new int[]{2,4,3};
        int[] arr2=new int[]{5,6,4};
        ListNode list1=createList(arr);
        printList(list1);
        ListNode list2=createList(arr2);
        printList(list2);

        addTwoNumbers(list1,list2);

    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current=l1;
        ListNode l1Head=new ListNode(-1);

        return new ListNode();
    }
}
