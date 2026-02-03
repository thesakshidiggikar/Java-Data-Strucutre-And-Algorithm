package Practice1;
import java.util.*;

public class GreaterThen {
    public static void GreaterThen(int a, int b) {
        if (a > b) {
            System.out.println("A is Greater then B : ");
        } else {
            System.out.println("B is Greater");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        GreaterThen(a, b);
    }
}
