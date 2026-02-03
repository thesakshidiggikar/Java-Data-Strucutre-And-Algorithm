public class LinkedListCycle11 {

    static class ListNode {
        int val;
        ListNode next;
    }

    public static void main(String args[]) {
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
        n6.next = n2;

        ListNode head = n1;
        System.out.println(Cyclecheck(head).val);

    }

    public static ListNode Cyclecheck(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
        
    }
}