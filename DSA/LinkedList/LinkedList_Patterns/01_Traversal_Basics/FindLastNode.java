public class FindLastNode {
    static class ListNode {
        int val;
        ListNode next;
    }

    public static void main(String[] args) {
        // create nodes
        ListNode n1 = new ListNode();
        n1.val = 2;

        ListNode n2 = new ListNode();
        n2.val = 5;

        ListNode n3 = new ListNode();
        n3.val = 8;

        // link nodes
        n1.next = n2;
        n2.next = n3;

        // head
        ListNode head = n1;
        System.out.println(LastNode(head) + " This is last Node");

    }

    public static int LastNode(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            if (curr.next == null) {
                return curr.val;

            }
            curr = curr.next;
        }
        return -1;

    }

}