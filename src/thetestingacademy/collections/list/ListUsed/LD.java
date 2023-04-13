package thetestingacademy.collections.list.ListUsed;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LD {

    public static void main(String[] args) {

        List<Integer> myMarks = new ArrayList<>();
        myMarks.add(91);
        myMarks.add(87);
        myMarks.add(80);

        // Can I store the student into the List?
        ATBStudent student1 = new ATBStudent(901,"Pramod","ATB");
        ATBStudent student2 = new ATBStudent(87,"Avinash","ATB");
        ATBStudent student3 = new ATBStudent(78,"Lucky","MTB");

        // 90, 12, 123 -> 12, 90, 123
        // ABC, XYZ, edf ->  abc, edf, xyz
        // Complex Data Types - Student , id name, courName ?

        List<ATBStudent> s1=  new ArrayList<>();
        s1.add(student1);
        s1.add(student2);
        s1.add(student3);

        System.out.println(s1);
        System.out.println(s1.size());


        ATBStudent s = s1.get(0);


        System.out.println(s.getId());
        System.out.println(s.getName());


       // Collections.sort(s1,new SortByName());
        Collections.sort(s1,new SortByIdDesc());
        System.out.println(s1);







    }
}

// Comparator


class SortByCourseName implements Comparator<ATBStudent>{
    @Override
    public int compare(ATBStudent o1,ATBStudent o2){
        return o1.getCourseName().compareTo(o2.getCourseName());
    }
}

class SortByName implements  Comparator<ATBStudent>{
    @Override
    public int compare(ATBStudent o1, ATBStudent o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortByIdDesc implements  Comparator<ATBStudent>{
    @Override
    public int compare(ATBStudent o1, ATBStudent o2) {
        return o2.getId().compareTo(o1.getId());
    }

}
class ATBStudent implements Comparable<ATBStudent> {
    private Integer id;
    private String name;
    private String courseName;

    @Override
    public String toString() {
        return "ATBStudent{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", courseName='" + courseName + '\'' +
                '}';
    }

    // id1 , id2 -> equal?   1, 2 ->




    public ATBStudent(Integer id, String name, String courseName) {
        this.id = id;
        this.name = name;
        this.courseName = courseName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     *
     * <p>The implementor must ensure
     * {@code sgn(x.compareTo(y)) == -sgn(y.compareTo(x))}
     * for all {@code x} and {@code y}.  (This
     * implies that {@code x.compareTo(y)} must throw an exception iff
     * {@code y.compareTo(x)} throws an exception.)
     *
     * <p>The implementor must also ensure that the relation is transitive:
     * {@code (x.compareTo(y) > 0 && y.compareTo(z) > 0)} implies
     * {@code x.compareTo(z) > 0}.
     *
     * <p>Finally, the implementor must ensure that {@code x.compareTo(y)==0}
     * implies that {@code sgn(x.compareTo(z)) == sgn(y.compareTo(z))}, for
     * all {@code z}.
     *
     * <p>It is strongly recommended, but <i>not</i> strictly required that
     * {@code (x.compareTo(y)==0) == (x.equals(y))}.  Generally speaking, any
     * class that implements the {@code Comparable} interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     *
     * <p>In the foregoing description, the notation
     * {@code sgn(}<i>expression</i>{@code )} designates the mathematical
     * <i>signum</i> function, which is defined to return one of {@code -1},
     * {@code 0}, or {@code 1} according to whether the value of
     * <i>expression</i> is negative, zero, or positive, respectively.
     *
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     */
    @Override
    public int compareTo(ATBStudent o) {
        // id, name, courseName?
        // id
        return Integer.compare(this.id,o.id);
    }

    // compareTo


}


// Student -> MathMake, Science, HindiMark int
// SortByMath - ASC, Desc
// SortByScience - ASC, Desc
// SortByHindi - ASC, Desc