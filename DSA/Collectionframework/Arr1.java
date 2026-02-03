

import java.util.ArrayList;

public class Arr1 {
    public static void main(String args[]) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        arr.add("E");
        System.out.println(arr);
        System.out.println(arr.get(4));
        System.out.println(arr.size());
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(i);
        }

        for (String x : arr) {
            System.out.println(x);
        }
        
        System.out.println(arr.contains("A"));
        System.out.println(arr.contains("C"));
        System.out.println(arr.remove(("D")));
        for (String x : arr) {
            System.out.println(x);
        }

        arr.add(2, "S");
        System.out.println(arr);

        arr.set(2, "X");
        System.out.println(arr);
    }

}
