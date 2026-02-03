import java.util.*;
public class StackMadeEasy {
public static void main(String[] args) {
    Stack<Integer> new1 = new Stack<>();
    new1.push(1);
    new1.push(2);
    new1.push(3);
    new1.push(4);
    new1.push(5);

    while (!new1.isEmpty()) {
        System.out.println(new1.peek());
        new1.pop();
    }
}


}
