import java.util.*;

public class IfElseCondition {
    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        int a1 = a.nextInt();

        Scanner b = new Scanner(System.in);
        int b1 = b.nextInt();

        if (a1 == b1) {
            System.out.println("A is Equal to B.");
        } else if (a1 > b1){
                System.out.println("A is Greater then B.");
            }
        else {
            System.out.println("B is Greater");
        }
        
    }
}
