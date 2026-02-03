package BinarySearch;

public class BS_2 {
    public static void main(String args[]) {
        int[] arr = {2, 4, 7, 10, 19, 24, 32, 48};
        int target = 10;
        
        int left = 0;
        int right = arr.length-1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                System.out.println(arr[mid] - 1);
                System.out.println(arr[mid] + 1);
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;

            }
        }
        System.out.println("Element Not Found");
    }
}
