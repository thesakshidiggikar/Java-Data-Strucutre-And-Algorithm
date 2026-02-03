

public class QueueCreation {
    static class Queue {
        int[] arr = new int[6];
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
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q.poll);
        System.out.println(q.peek()); //remove nahi
        System.out.println(q.poll());  //5(remove)
    }
}
