package thetestingacademy.collections.list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

    public static void main(String[] args)
    {
        // Creating a list of names
        List<String> names = new LinkedList<>();

        names.add("Pramod");
        names.add("Dutta");
        names.add("Lucky");

        // Getting ListIterator
        ListIterator<String> namesIterator
                = names.listIterator();

        // Traversing elements using next() method
        while (namesIterator.hasNext()) {

            // Forward direction - hasNext(): next() nextIndex():
            System.out.println(namesIterator.next());
        }
        System.out.println("---- Backward each below ----");
        // Backward direction hasPrevious():previous(): previousIndex():

        while (namesIterator.hasPrevious()) {

            // Forward direction - hasNext(): next() nextIndex():
            System.out.println(namesIterator.previous());
        }

        System.out.println("---- for each below ----");

        // for-each loop creates Internal Iterator here.
        for (String s : names) {
            System.out.println(s);
        }
    }
}
