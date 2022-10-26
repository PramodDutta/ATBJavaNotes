package thetestingacademy.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableSort {

    public static void main(String[] args) {

        Student student = new Student(1,"Pramod");
        Student student2 = new Student(10,"Dutta");
        Student student3 = new Student(3,"Autta");

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student2);
        students.add(student3);
       // Collections.sort(students);
       // Collections.sort(students,new Asc());
        Collections.sort(students,new SortByName());
        System.out.println(students);

    }
}
