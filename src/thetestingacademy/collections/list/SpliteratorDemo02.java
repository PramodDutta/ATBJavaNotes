package thetestingacademy.collections.list;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliteratorDemo {

    public static void main(String[] args) {


        ArrayList<Integer> al = new ArrayList<>();
        // Add values to the array list.
        al.add(1);
        al.add(2);
        al.add(-3);
        al.add(-4);
        al.add(5);
        // getting Spliterator object on al
        Spliterator<Integer> splitr1 = al.spliterator();

        // estimateSize method
        System.out.println("estimate size : " + splitr1.estimateSize());
        // getExactSizeIfKnown method
        System.out.println("exact size : " + splitr1.getExactSizeIfKnown());


        // Split

        Spliterator<Integer> splitr1_split = splitr1.trySplit();
// If splitr1 could be split, use splitr2 first.
        if(splitr1_split != null) {
            System.out.println("Output from splitr2: ");
            splitr1_split.forEachRemaining((n) -> System.out.println(n));
        }

        // Now, use the splitr
        System.out.println("\nOutput from splitr1: ");
        splitr1.forEachRemaining((n) -> System.out.println(n));





        ArrayList<Integer> tempList = new ArrayList<>();
        while(splitr1.tryAdvance((n) -> tempList.add(Math.abs(n))));
        Spliterator<Integer> splitr2 = tempList.spliterator();
        while(splitr2.tryAdvance((n) -> System.out.println(n)));


    }
}
