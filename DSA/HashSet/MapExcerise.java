
import java.util.*;

public class MapExcerise {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 1);
        map.put("US", 12);
        map.put("Greece", 4);
        map.put("Germany", 8);
        System.out.println(map);

        int st = map.get("Germany");
        System.out.println(st);

        // int st1 = map.get("Russia");
        // System.out.println(st1);
        //it key exit or not
        System.out.println(map.containsKey("Thailand"));

        //if value exits or not
        System.out.println(map.containsValue(100));

        //loop chalana => keys
        Set<String> keys = map.keySet();
        for (String i : keys) {
            System.out.println(map.get(i));

        }
        // Set<String> keys = map.keySet();
        for (String i : map.keySet()) {
            System.out.println(map.get(i));

        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
 
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //
    }
}
