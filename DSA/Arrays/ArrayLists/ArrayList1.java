import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
    public static void main(String args[]) {
        //creating arraylist

        // int >> INTEGER
        // float

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        // ArrayList<String> list2 new ArrayList1<String>();


        //add element
        list1.add(0);
        list1.add(1);
        list1.add(2);
        System.out.println(list1);


        //get element
        int element = list1.get(0);
        System.out.println(element);

        // add element in between
        list1.add(1, 1);
        System.out.println(list1);

        //set elemtn  update or chnage the existing element
        list1.set(0, 6);
        System.out.println(list1);

        //delete element
        // list1.remove(2);
        System.out.println(list1);

        //count element in list
        System.out.println(list1.size());

        //loops
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        //sorting
        Collections.sort(list1);
        System.out.println(list1);
    }
}
