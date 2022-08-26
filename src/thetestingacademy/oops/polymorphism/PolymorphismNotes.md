#### What is Polymorphism?

Poly means many and Morph means forms.

polymorphism refers to the same object exhibiting different forms and behaviors

Shape Class. The exact shape you choose can be anything. It can be a rectangle, a circle, a polygon or a diamond. So, these are all shapes but their properties are different.

#### Method overriding aka Dynamic /Runtime polymorphism
Shape[] shape = new Shape[2]; // Creating shape array of size 2

    shape[0] = new Circle(2); // creating circle object at index 0
    shape[1] = new Rectangle(2, 2); // creating rectangle object at index 1

    System.out.println("Area of the Circle: " + shape[0].getArea());
    System.out.println("Area of the Rectangle: " + shape[1].getArea());


#### Method Overloading aka Static polymorphism

Arguments must be different in the case of overloading.

int add(int num1, int num2)
int add(int num1, int num2, int num3 )
int add(int num1, int num2, int num3, int num4 )


#dynamic or runtime polymorphism

Shape obj1 = new Circle(3);
Shape obj2 = new Rectangle(2, 3);
obj1.getArea();
obj2.getArea();

``` obj1.getArea() will execute getArea() method of the subclass Circle class. ```

``` obj2.getArea() will execute getArea() method of the subclass Rectangle class. ```