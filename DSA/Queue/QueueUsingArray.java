import java.util.*;
public class QueueUsingArray {

    static class Queue {

        int[] arr;
        int front, rear, size;

        Queue(int size) {
            this.size = size;
            arr = new int[size];
            front = 0;
            rear = -1;
        }

        boolean isEmpty() {
            return rear < front;
        }

        boolean isFull() {
            return rear == size - 1;
        }

        void enqueue(int val) {
            if (isFull()) {
                System.out.println("Queue Overflow");
                return;
            }
            arr[++rear] = val;
        }

        int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue Underflow");
                return -1;
            }
            return arr[front++];
        }

        int peek() {
            if (isEmpty()) {
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue()); // 10
        System.out.println(q.dequeue()); // 20

        q.enqueue(40);
        q.enqueue(50);

        while (!q.isEmpty()) {
            System.out.println(q.dequeue());
        }
    }
}
