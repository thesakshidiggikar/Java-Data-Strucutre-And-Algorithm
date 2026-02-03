package Practice1;
import java.util.*;

public class OddEven {
    public static void OddEven(int n) {
        if (n % 2 == 0) {
            System.out.println("It is Even Number: " + n);

        } else {
            System.out.println("It is Odd Number: " + n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        OddEven(n);
    }
}
