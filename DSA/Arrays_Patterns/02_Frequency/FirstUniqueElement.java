import java.util.HashMap;

public class FirstUniqueElement {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 3, 6, 5, 6, 7 };
        HashMap<Integer, Integer> map = new HashMap<>();
        int count =0;

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 1)+1);
            count+=1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i])== 1) {
                System.out.println("First Unique Element : " + arr[i]);
                break;
            }
        }
    }
}