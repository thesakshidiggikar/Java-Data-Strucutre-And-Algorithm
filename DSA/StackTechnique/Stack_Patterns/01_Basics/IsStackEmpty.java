
import java.util.Stack;

public class IsStackEmpty {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        if (s.isEmpty()) {
            System.out.println("Yes it its empty");
        } else {
            System.out.println("No it is not empty");
        }
    }
}