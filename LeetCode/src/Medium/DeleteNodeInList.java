package Medium;

public class DeleteNodeInList {
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
        DeleteNodeInList dl= new DeleteNodeInList();
        int[] arr=new int[]{2,4,3,5,6,7};
        ListNode list1=dl.createList(arr);
        dl.printList(list1);
        dl.deleteNode(list1.next.next.next);
    }

    public  void deleteNode(ListNode node) {

        printList(node);

        if (node == null || node.next == null) {
            return;
        }

        ListNode currNode= node;
        ListNode prevNode=node;

        while (currNode.next != null){
            prevNode=currNode;
            currNode.val=currNode.next.val;
            currNode=currNode.next;
        }

        prevNode.next=null;
        System.out.println(currNode.val +" - "+currNode.next);
        System.out.println(prevNode.val +" - "+prevNode.next);

        printList(node);
    }
}
