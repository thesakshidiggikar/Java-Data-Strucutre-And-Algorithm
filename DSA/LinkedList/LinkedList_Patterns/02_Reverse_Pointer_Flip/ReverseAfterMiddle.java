public class ReverseAfterMiddle {
    static class ListNode {

        int val;
        ListNode next;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode();
        n1.val = (11);

        ListNode n2 = new ListNode();
        n2.val = (2);

        ListNode n3 = new ListNode();
        n3.val = (98);

        ListNode n4 = new ListNode();
        n4.val = (15);

        ListNode n5 = new ListNode();
        n5.val = (21);

        ListNode n6 = new ListNode();
        n6.val = (136);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = null;

        ListNode head = n1;
        // System.out.println(head);
        System.out.println(RevMiddle(head).val);
    }

    public static void RevMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
       int n = I

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        // reverse after middle
        ListNode prev = null;
        ListNode curr = slow.next;
        slow.next = null;
        while (curr != null) {
            ListNode nextnode = curr.next;
            curr.next = prev;
            curr = prev;
            curr = nextnode;
        }
        return prev;
    }
}