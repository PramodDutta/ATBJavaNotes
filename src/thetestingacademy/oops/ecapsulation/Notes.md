Encapsulation in OOP refers to binding the data and the methods to manipulate that data together in a single unit (class).



Encapsulation is normally done to hide the state and representation of an object from outside



a good convention is to declare all the data members or instance variables of a class private

### Advantages of Encapsulation
- Classes are easier to change and maintain.
- We can specify which data member we want to keep hidden or accessible.
- We decide which variables have read/write privileges (increases flexibility).


Create a Rectangle Class

1. Input Length, Width.
2. get Area - L * W
3. Default C, Parameter C



// Class Rectangle
class Rectangle {

// Private Fields
private int length;
private int width;

// Default Constructor
public Rectangle() {
this.length = 0;
this.width = 0;
}

// Parameterized Constructor
public Rectangle(int length, int width) {
this.length = length;
this.width = width;

}

// Method to calculate Area of a rectangle
public int getArea() {
return this.length * this.width;
}

}

class Demo {

public static void main(String args[]) {

    Rectangle obj = new Rectangle(2, 2);
    System.out.println(obj.getArea());

}

}

