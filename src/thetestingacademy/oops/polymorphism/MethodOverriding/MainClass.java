package thetestingacademy.oops.polymorphism.MethodOverriding;

public class MainClass {

    public static void main(String[] args) {

        // Shape - getArea
        // Rectabgle - getArea
        // Circle - getArea

        Shape shape = new Shape();
        Shape shape1 = new Shape();

        shape = new Circle(30);
        double cicleArea = shape.getArea();
        System.out.println(cicleArea);

        shape1 = new Rectangle(3,4);
        double recArea = shape1.getArea();
        System.out.println(recArea);



    }
}
