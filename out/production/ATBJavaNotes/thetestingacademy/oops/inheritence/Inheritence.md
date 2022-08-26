## What is Inheritance?
- Inheritance provides a way to create a new class from an existing class
- new class is a specialized version of the existing class such that it inherits all the non-private fields (variables) and methods of the existing class.
- The existing class is used as a starting point or as a base to create the new class.

#### The IS A relationship

A square IS A shape
Java IS A programming language
Car IS A vehicle

#### Terms

- SuperClass (Parent Class or Base Class)
- SubClass (Child Class or Derived Class)

*An object of the child class can use* :
- All non-private members defined in the child class.
- All non-private members defined in the parent class.

The extends Keyword

SubClass extends SuperClass{
//contents of SubClass
}


this keyword in Java is used to refer to the instance of the current class.

the super keyword in Java is used to refer to the SuperClass members from inside the immediate Subclass.


### Use of Super 
Accessing parent class fields
Calling a parent class method
Using with constructors (Calling parent default constructors)

### Types of Inheritance
- Single - Vehicle class (Super class) and the Car class (Sub class)
- Multi-level 
  - A Car IS A Vehicle
  - A Tesla EV IS A Car
- Hierarchical
  - A Tesla Car IS A Vehicle
  - A Tesla Truck IS A Vehicle

In Java, Multiple and Hybrid inheritance are applicable using interfaces only.

- Multiple
  - A Hyundai Elantra IS A Car
  - A Hyundai Elantra IS A Sedan
- Hybrid
  - A combustion engine is an engine
  - An electric motors engine is an engine
  - A Hybrid engine combines both combustion engine and electric motors



Super Keyword

this keyword in Java is used to refer to the instance of the current class
the super keyword in Java is used to refer to the SuperClass members from inside the immediate Subclass.

What Super can Do?
You can use Super to Accessing parent class fields.
Calling a parent class method#