package thetestingacademy.problem.oops.AbstractDemo.zero;

public class Example004 {
    public static void main(String[] args) {
        Person pob = new CurrentStudent();
        pob.sleeping();
        pob.walking();
    }
}


abstract class Person {
    abstract void sleeping();
    abstract void walking();
}

abstract class Student extends Person {
    void sleeping() {
        System.out.println("Student -> sleeping()");
    }
}

class CurrentStudent extends Student {
    void walking() {
        System.out.println("CurrentStudent -> walking()");
    }
}
