package thetestingacademy.collections.set;

import java.util.HashSet;

public class HashSet00 {

    public static void main(String[] args) {

        // Defualt 0.75
        HashSet<String> hs = new HashSet<>();

        // HashSet<E> hs = new HashSet<E>(int initialCapacity);
        HashSet<String> hs3 = new HashSet<>(20);

        //HashSet<E> hs = new HashSet<E>(int initialCapacity, float loadFactor);
        HashSet<String> hs2 = new HashSet<String>(10, 1.5f);
    }
}
