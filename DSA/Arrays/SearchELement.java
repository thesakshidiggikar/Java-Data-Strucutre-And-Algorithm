import java.util.*;

public class SearchELement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();        
        int number[] = new int[size];


        //innerloop
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        
        // output
        for (int i = 0; i < number.length; i++) {
            if (number[i] == target) {
                System.out.println("Element Found at Index : " + i);
            } else {
                System.out.println("Element out of index.");
            }
        }
    }
}
