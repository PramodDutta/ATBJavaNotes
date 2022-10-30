package thetestingacademy.corejava.generics;

public class GRunner {

    public static void main(String[] args) {

        NotGeneric notGeneric = new NotGeneric();
        notGeneric.add("Pramod");
        notGeneric.add("Dutta");
        notGeneric.add("lucky");
       // notGeneric.add(100); Not possible
        notGeneric.remove("Dutta");

        // Make it Generic
        GenericDemo<String> genericDemo = new GenericDemo<>();
        genericDemo.add("Test");
        //genericDemo1.something(100);

        GenericDemo<Integer> genericDemo1 = new GenericDemo<>();
        genericDemo1.add(100);
        genericDemo1.something(100);

    }
}
