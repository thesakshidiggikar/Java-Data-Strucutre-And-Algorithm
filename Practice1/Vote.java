package Practice1;
import java.util.Scanner;

public class Vote {
    public static void Validate(int n) {
        if (n >= 18) {
            System.out.println("You are Eligible to vote");
        } else {
            System.out.println("You are not Eligibe to vote");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Validate(n);
    }
}
