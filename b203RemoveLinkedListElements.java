public class b203RemoveLinkedListElements {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
//        head.next.next = new ListNode(6);
//        head.next.next.next = new ListNode(3);
//        head.next.next.next.next = new ListNode(4);
//        head.next.next.next.next.next = new ListNode(5);
//        head.next.next.next.next.next.next = new ListNode(6);

        int val = 1;
        ListNode result = removeElements(head, val);

        while (result!= null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        while (head != null && head.val == val) {
            head = head.next;
        }

         ListNode currentNode = head;
        while (currentNode != null && currentNode.next != null) {
            if (currentNode.next.val == val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }

        return head;
    }
}
