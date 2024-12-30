public class b83RemoveDuplicateSortedKList {

     public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


    public static void main(String[] args) {
        int[] x = {1,1,1,2,2,2,2,3,3,3,3};
        ListNode head = new ListNode(x[0]);
        ListNode current = head; // Giữ lại một con trỏ để duyệt danh sách
        for (int i = 1; i < x.length; i++) {
            current.next = new ListNode(x[i]);
            current = current.next; // Cập nhật con trỏ current
        }

        ListNode result = deleteDuplicates(head);
        while(result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
      if(head == null || head.next == null) return null;
        ListNode currentNode  = head;
        while(currentNode.next != null) {
            if(currentNode.val == currentNode.next.val) {
                currentNode.next = currentNode.next.next;
            }
            else {
                currentNode = currentNode.next;
            }
        }
        return head;

    }

}
