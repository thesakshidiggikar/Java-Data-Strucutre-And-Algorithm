
import java.util.HashMap;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 5, 3, 7};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                System.out.println("Duplicate found: " + arr[i]);
                return;
            } else {
                map.put(arr[i], 1);
            }
        }

        System.out.println("No duplicate found");
    }
}
