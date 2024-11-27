package Hard;

import Medium.RemoveNthNodeList;

public class ReverseNodeInKGroups {


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
        ReverseNodeInKGroups dl= new ReverseNodeInKGroups();
        int[] arr=new int[]{2,4,3,5,6,7};
        ListNode list1=dl.createList(arr);
        dl.printList(list1);
        dl.printList(reverseKGroup(list1,3));
    }

    public static ListNode reverseKGroup(ListNode head, int k) {

        if(head == null || k == 1){
            return head;
        }
        // Find the length of the linked list
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }

        System.out.println(length);
        // Reverse in groups of k
        for (int left = 1, right = k; right <= length; left += k, right += k) {
            head = reverseBetween(head, left, right);
        }


        return head;
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        // Create a dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // Move `prev` to the node just before the `left` position
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // Reverse the sublist from `left` to `right`
        ListNode curr = prev.next; // The first node of the sublist to reverse
        ListNode sublistTail = curr; // Save this to connect with the rest of the list later
        ListNode prevNode = null;

        for (int i = 0; i <= right - left; i++) {
            ListNode tempNode = curr.next;
            curr.next = prevNode;
            prevNode = curr;
            curr = tempNode;
        }

        // Connect the reversed sublist with the rest of the list
        prev.next = prevNode; // Connect `prev` to the head of the reversed sublist
        sublistTail.next = curr; // Connect the tail of the reversed sublist to `curr`

        return dummy.next;
    }

}
