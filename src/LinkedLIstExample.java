import java.util.Collections;
import java.util.LinkedList;

public class LinkedLIstExample {

    public void linkedList() {

        LinkedList<String> itemLinked = new LinkedList<String>();

        itemLinked.add("Item1");
        itemLinked.add("Item5");
        itemLinked.add("Item3");
        itemLinked.add("Item6");
        itemLinked.add("Item2");

        System.out.println("Linked List Content: " + itemLinked);
        itemLinked.addFirst("First Item");
        itemLinked.addLast("Last Item");
        System.out.println("Linked List Content: " + itemLinked);

        /*this is how to get and set Values*/
        Object firstVar = itemLinked.get(0);
        System.out.println("First Element : " + firstVar);
        itemLinked.set(0, "Changed first item");
        Object firstVar2 = itemLinked.get(0);
        System.out.println("First element after update by set method: " + firstVar2);

        //Remove first and last elements
        itemLinked.removeFirst();
        itemLinked.removeLast();
        System.out.println("Linked List Content: " + itemLinked);

        //add to a position and remove from a position
        itemLinked.add(0, "Newly added item");
        itemLinked.remove(2);
        System.out.println("final cotent:  " + itemLinked);
        Collections.sort(itemLinked);
        System.out.println("Sorted List Content: " + itemLinked);

    }
}
