package thetestingacademy.problem.oops.AbstractDemo.zero;

public class OOPsProblemAbs {

    public static void main(String[] args) {
//        Parent c = new Child();
        Child c = new Child();
        c.area();

    }
}

class Parent{
    void area(){
        System.out.println("Parent");
    }
}

class Child extends Parent{

}
