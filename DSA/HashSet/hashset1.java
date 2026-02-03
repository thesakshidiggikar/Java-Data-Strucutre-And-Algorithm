import java.util.*;
import java.util.HashSet;
// package DSA.HashSet;

public class hashset1 {
    public static void main(String args[]) {
        //creation
        HashSet<Integer> set = new HashSet<>();
        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);

        //search
        if (set.contains(2)) {
            System.out.println("True");
        }
        if (!set.contains(6)) {
            System.out.println("It doesn't contain 6 ");
        }

        //delete
        set.remove(3);
        if (!set.contains(3)) {
            System.out.println("We delete 3");
        }
        
                //iterator
        Iterator it = set.iterator();
        //hasNext;
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
    

}
