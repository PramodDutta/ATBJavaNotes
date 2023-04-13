package thetestingacademy.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List06 {

    //ConcurrentModificationException
    public static void main(String[] args) {
        List ttacourseList = new ArrayList();
        ttacourseList.add("ATB");
        ttacourseList.add("MTB");
        ttacourseList.add("LAPIT");
        ttacourseList.add("SDET Blueprint");
        ttacourseList.add("Java for Testers");

        ListIterator lt = ttacourseList.listIterator();
        while(lt.hasPrevious()){
            System.out.println(lt.previousIndex());
//                 lt.add("Hello"); //OK
//                 lt.remove(); //OK
//                lt.set("Hello"); //OK
               ttacourseList.add("Python"); // Not Ok
        }
        System.out.println(ttacourseList);

    }
}
