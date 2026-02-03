import java.util.HashMap;


public class hashmap1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hp = new HashMap<>();

        //insert data
        hp.put("India", 120);
        hp.put("China", 40);
        hp.put("US", 12);
        System.out.println(hp);
        hp.put("US", 150);
        System.out.println(hp);

        //search
        if (hp.containsKey("France")) {
            System.out.println("Key is present");
        } else {
            System.out.println("Key is not present");
        }
        System.out.println(hp.get("China")); //key exists
        System.out.println(hp.get("Indonesia")); //key doesn't exist

        //iterator
        // int arr[] = {12, 15, 18};
        // for (int i = 0; i < 3; i++) {
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // for(int val : arr){
        //     System.out.print(val+" ");
        // }
        // System.out.println();

        // for ( Map.Entry<String ,Integer> e: hp.entrySet()){
        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());
        // }

        // Set<String> keys = hp.keySet();
        // for (String key : keys) {
        //     System.out.println(key + " " + hp.get(key));
        // }

        //to remove
        System.out.println(hp.remove("China"));
        System.out.println(hp);

    }

}
