import java.util.*;

public class DynamicStack {

    // public static void main(String[] args) {
    //     Stack<Integer> s = new Stack<>();
    //     s.push(10);
    //     s.push(20);
    //     s.push(30);
    //     s.push(40);
    //     System.out.println(s);
    // }

    static class Stack {

        int[] arr;
        int top;

        Stack() {
            arr = new int[2];  // initial small size
            top = -1;
        }

        void push(int val) {
            if (top == arr.length - 1) {
                // resize
                int[] newArr = new int[arr.length * 2];
                for (int i = 0; i < arr.length; i++) {
                    newArr[i] = arr[i];
                }
                arr = newArr;
            }
            arr[++top] = val;
        }

        int pop() {
            if (top == -1) {
                return -1;
            }
            return arr[top--];
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50); // resize happens

        while (s.top != -1) {
            System.out.println(s.pop());
        }
    }
}
