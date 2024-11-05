package Medium;

public class RemoveDuplicatesFromSorted2 {

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
        RemoveDuplicatesFromSorted2 dl= new RemoveDuplicatesFromSorted2();
        int[] arr=new int[]{1,1,2,2,3,4};
        ListNode list1=dl.createList(arr);
        dl.printList(list1);
        dl.deleteDuplicates(list1);
    }

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        while (head != null && head.next != null && head.val == head.next.val) {
            int duplicateVal = head.val;
            while (head != null && head.val == duplicateVal) {
                head = head.next;
            }
        }

        ListNode prevNode = head;
        ListNode currNode = (head != null) ? head.next : null;

        while (currNode != null && currNode.next != null){
            if( currNode.val == currNode.next.val){

                int duplicateVal = currNode.val;
                while (currNode != null && currNode.val == duplicateVal) {
                    currNode = currNode.next;
                }
                prevNode.next = currNode;
            }else{
                prevNode=currNode;
                currNode=currNode.next;
            }
        }
        printList(head);
        return  head;
    }
}
