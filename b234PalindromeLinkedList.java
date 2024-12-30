import java.util.Stack;

public class b234PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        System.out.println(isPalindrome(head)); // true

    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static boolean isPalindrome(ListNode head) {
        Stack<Integer> stack =  new Stack<>();
        ListNode current = head;
        while(current != null) {
            stack.push(current.val);
            current = current.next;
        }
        current = head;
        while (current != null) {
            if (stack.pop()!= current.val) {
                return false;
            }
            current = current.next;
        }
        return true;
    }
}
