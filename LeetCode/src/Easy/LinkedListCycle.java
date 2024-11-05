package Easy;

public class LinkedListCycle {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
        @Override
        public String toString() {
            return "Node[ val: " + val + ", address: " + System.identityHashCode(this) +
                    ", next: " + (next != null ? System.identityHashCode(next) : "null") + " ]";
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next;
        System.out.println(hasCycle(head));
    }

    public static boolean hasCycle(ListNode head) {

        ListNode slow=head;
        ListNode fast=head.next;
        while (slow != fast){
            if(fast == null || fast.next==null){
                return false;
            }
            slow= slow.next;
            fast=fast.next.next;
            System.out.println("slow: "+slow);
            System.out.println("fast: "+fast);
        }

        return true;
    }
}
