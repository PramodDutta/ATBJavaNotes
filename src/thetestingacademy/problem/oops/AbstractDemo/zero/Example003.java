package thetestingacademy.problem.oops.AbstractDemo.zero;

public class Example003 {
    public static void main(String[] args) {
        Shape sp = new Square();
        sp.area();
    }
}

abstract class Shape {
    abstract void area();
}

class Square extends Shape {
    void area() {
        System.out.println("Square > area()");
    }
}
