package thetestingacademy.collections.list;

import thetestingacademy.staticImport.MainCass;

import java.util.List;

public class List00 {
    public static void main(String[] args) {
        List fruites = List.of("orange","apple");
        System.out.println(fruites);
        // Size
        System.out.println(fruites.size());
        System.out.println(fruites.get(0));
        System.out.println(fruites.get(1));
        //System.out.println(fruites.get(2));

        // Find the Value
        System.out.println(fruites.indexOf("apple"));

        // IsEmpty
        System.out.println(fruites.isEmpty());

        // You can't add new
        fruites.add("banana");
    }
}
