package thetestingacademy.problem.oops.AbstractDemo.zero;

public class Example005 {

    public static void main(String[] args) {
        Person pob = new CurrentStudent();
        pob.sleeping();
        pob.walking();
    }
}
// Someone has to fulfill all the abstract methods
abstract class Human {
    abstract void sleeping();

    abstract void walking();
}

abstract class Pramod extends Human {
    void sleeping() {
        System.out.println("Pramod -> sleeping()");
    }
}

class PramodStudent extends Pramod {
    void walking() {
        System.out.println("PramodStudent -> walking()");
    }
}