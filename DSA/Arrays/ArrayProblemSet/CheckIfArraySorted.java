public class CheckIfArraySorted {
    public static void main(String args[]) {
        int[] arr = new int[] { 20, 30, 12, 45, 1, 8, 2, 99 };
        boolean isSorted = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("Yes, elements are sorted in ascending order");
        } else {
            System.out.println("No, elements are NOT sorted in ascending order");
        }
        
    }
}
