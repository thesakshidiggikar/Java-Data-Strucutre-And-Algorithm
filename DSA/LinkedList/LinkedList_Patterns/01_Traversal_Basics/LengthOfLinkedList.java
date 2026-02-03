public class LengthOfLinkedList {
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

        System.out.println("This Length is  : " + (LengthofList(head)));

    }
    
    public static int LengthofList(ListNode head) {
        ListNode curr = head;
        int l = 0;
        while (curr != null) {
            l += 1;
            curr = curr.next;
        }
        return l;
    }

}