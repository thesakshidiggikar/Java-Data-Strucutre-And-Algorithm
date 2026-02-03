
import java.util.Stack;

public class ReverseStack {

    public static void insertAtBottom(Stack<Integer> s, int x) {
        if (s.isEmpty()) {
            s.push(x);
            return;

        } else {
            int top = s.pop();
            insertAtBottom(s, x);
            s.push(top);
        }

        
    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        insertAtBottom(s, top);

    }

    public static void main(String args[]) {

        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        System.out.println("Before reverse: " + s);

        reverseStack(s);   // 🔥 yeh sabse important line

        System.out.println("After reverse: " + s);

    }
}