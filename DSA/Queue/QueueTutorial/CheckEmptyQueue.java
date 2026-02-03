import java.util.*;

public class CheckEmptyQueue {
    static class MyQueue {
        int[] arr = new int[5];
        int front = 0;
        int rear = 0;
        int size;

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
}
