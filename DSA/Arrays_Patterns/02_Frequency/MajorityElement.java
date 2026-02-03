
import java.util.HashMap;

public class MajorityElement {

    public static void main(String[] args) {

        int[] arr = {1, 18, 2, 4, 19, 2, 0, 2, 4, 3, 3, 3, 3};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);   // ✅ FIX
            }
        }

        int n = arr.length;

        for (int key : map.keySet()) {
            if (map.get(key) > n / 2) {
                System.out.println("Majority element: " + key);
                return;
            }
        }

        System.out.println("No Majority element found");
    }
}
