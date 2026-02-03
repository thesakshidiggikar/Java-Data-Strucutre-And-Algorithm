import java.util.Arrays;
import java.util.LinkedList;
public class Test {
    public static void main(String[] args) {

        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(10);
        linkedlist.add(20);
        linkedlist.add(30);
        linkedlist.add(40);
        linkedlist.add(50);

        System.out.println(linkedlist);
        System.out.println(linkedlist.get(3));
        linkedlist.addLast(60);
        linkedlist.addFirst(70);
        System.out.println(linkedlist);
        linkedlist.getLast();
        System.out.println(linkedlist);

        linkedlist.remove(3);
        System.out.println(linkedlist);
        linkedlist.removeIf(x -> x % 2 == 0);
        System.out.println(linkedlist);

        LinkedList<String> animal = new LinkedList<>(Arrays.asList("Cat", "Dog", "Bird", "Elephant", "Dinosaur"));
        LinkedList<String> notwanted = new LinkedList<>(Arrays.asList("Dog", "Cat"));
        animal.removeAll(notwanted);
        
        System.out.println(animal);
    }

}
