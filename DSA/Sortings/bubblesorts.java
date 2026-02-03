
public class bubblesorts {
    public static void main(String args[]) {
        int[] arr = new int[] {7,8,3,1,2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    arr[i] = arr[j];
                    arr[j] = arr[i];
                }
            }
        }
        System.out.println(arr);
    }
}
