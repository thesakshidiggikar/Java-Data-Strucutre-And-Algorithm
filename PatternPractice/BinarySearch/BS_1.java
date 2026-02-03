import java.util.*;

public class BS_1 {
    public static void main(String args[]) {
        int[] arr = { 2, 4, 7, 10, 19, 24, 32, 48 };
        int target = 10;
        int left = 0;
        int right = arr.length-1;
        
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                System.out.println(arr[mid]);
                return;
            } else if (arr[mid] > target) {
                left = mid - 1;
            } else {
                right = mid + 1;
            }
        }
        System.out.println("Element not found in array!");

    }
}
