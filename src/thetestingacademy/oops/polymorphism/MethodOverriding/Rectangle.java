package thetestingacademy.oops.polymorphism.MethodOverriding;

public class Rectangle extends Shape {

    int l;
    int w;

    Rectangle(int l,int w){
        this.l = l;
        this.w = w;
    }

    public double getArea(){
        System.out.println("Rec Area Called");
        return l*w;
    }

}
