package thetestingacademy.collections.map;

import java.util.*;

public class SortHashMaptByValue {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(6,"Tushar");
        hm.put(12,"Ashu");
        hm.put(5,"Zoya");
        hm.put(78,"Yash");
        hm.put(10,"Praveen");
        hm.put(67,"Boby");
        hm.put(1,"Ritesh");
        System.out.println("Before Sorting:");
        Set set = hm.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry map = (Map.Entry) iterator.next();
            System.out.println("Roll no:  " + map.getKey() + "     Name:   " + map.getValue());
        }

        Map<Integer, String> map = sortValues(hm);
        System.out.println("\n");
        System.out.println("After Sorting:");
        Set set2 = map.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext())

        {
            Map.Entry me2 = (Map.Entry) iterator2.next();
            System.out.println("Roll no:  " + me2.getKey() + "     Name:   " + me2.getValue());
        }

    }

    //method to sort values
    private static HashMap sortValues(HashMap map) {
        List list = new LinkedList(map.entrySet());
//Custom Comparator
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
            }
        });
//copying the sorted list in HashMap to preserve the iteration order
        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext(); ) {
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }
    }

