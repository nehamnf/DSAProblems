package Easy;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        MergeLinkedList l= new MergeLinkedList();
        ListNode list=l.creatList(new int[]{1,2,2,3,1});
        System.out.println(isPalindrome(list));
//        System.out.println(isPalindromeUsingArrayList(list));
    }

    //using stack and slow fast pointer
    public static boolean isPalindrome(ListNode head) {


        if(head == null || head.next == null){
            return true;
        }
        Stack<Integer> stack = new Stack<>();
        ListNode slow=head,fast=head;
        while ((fast != null && fast.next != null)) {
            stack.push(slow.val);
            slow = slow.next;
            fast=fast.next.next;
        }

        if(fast != null){
            slow=slow.next;
        }

        System.out.println(stack);
        while (slow != null){
            System.out.println("slow: "+slow.val +" head: "+head.val);
            if(slow.val != stack.pop()) {
                return false;
            }
            slow=slow.next;
        }
        return true;
    }


//    public ListNode reverse(ListNode node){
//
//    }

    public static boolean isPalindromeUsingArrayList(ListNode head) {

        ArrayList<Integer> stack= new ArrayList<>();

        if(head == null || head.next == null){
            return true;
        }
        ListNode currNode=head;
        while (currNode != null) {
            stack.add(currNode.val);
            currNode = currNode.next;
        }

        int left=0,right=stack.size()-1;
        while (left <= right){
            if(Objects.equals(stack.get(left), stack.get(right))){
                left++;
                right--;
            }else {
                return false;
            }
        }
        System.out.println(stack);
        return true;
    }
}
