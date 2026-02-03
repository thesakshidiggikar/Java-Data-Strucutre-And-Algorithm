import java.util.*;

public class QueueBasic {
    static class MyQueue {
        int[] arr = new int[5];
        int front = 0;
        int rear = 0;

        void enqueue(int x) {
            arr[rear] = x;
            rear++;
        }

        int dequeue() {
            int val = arr[front];
            front++;
            return val;
        }
    }
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
    
}
