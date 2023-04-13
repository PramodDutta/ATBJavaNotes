package thetestingacademy.generics.start;

public class GenericsRunner {
    public static void main(String[] args) {

        PCustomList<String> customList = new PCustomList<>();
        customList.add("Pramod");
        customList.add("Dutta");
        customList.add("Luckt");
        customList.remove("Luckt");
        customList.printList();

        PCustomList<Integer> customList2 = new PCustomList<>();
        customList2.add(1);
        customList2.add(2);
        customList2.add(3);
        customList2.remove(3);
        customList2.printList();


    }
}
