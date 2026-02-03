
import java.util.*;

public class Doublylinkedlistpracice1 {

    public static class Node {

        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next; // FIX 1
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(3);
        Node c = new Node(2);
        Node d = new Node(1);
        Node e = new Node(1);

        a.next = b;
        b.prev = a;

        b.next = c;
        c.prev = b;

        c.next = d;
        d.prev = c;

        d.next = e;
        e.prev = d;

        display(a); // FIX 2
    }
}
