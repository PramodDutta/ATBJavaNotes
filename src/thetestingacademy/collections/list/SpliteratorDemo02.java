package thetestingacademy.collections.list;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo02 {

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


        ArrayList<Integer> tempList = new ArrayList<>();
        while(splitr1.tryAdvance((n) -> tempList.add(Math.abs(n))));
        Spliterator<Integer> splitr2 = tempList.spliterator();
        while(splitr2.tryAdvance((n) -> System.out.println(n)));


    }
}
