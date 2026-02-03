import java.util.*;

public class OddEven {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int check = sc.nextInt();

        if (check % 2 == 0) {
            System.out.println("It is Even number.");
        } else {
            System.out.println("It is odd number.");
        }
    }
}
