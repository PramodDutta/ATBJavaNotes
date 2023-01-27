### Static Keyword

Was introduced for better memory management.

Static can be applied to
- block
- variables
- Methods
- Classes

When a member is declared static, it can be accessed before any objects of its class are created, and without reference to any object

### Static Block
static block that gets executed exactly once, when the class is first loaded.

### Static variables
When a variable is declared as static, then a single copy of the variable is created and shared among all objects at the class level

### Static methods

They can only directly call other static methods.
They can only directly access static data.
They cannot refer to this or super in any way.


### When to use static variables and methods?
Use the static variable for the property that is common to all objects

![](https://media.geeksforgeeks.org/wp-content/cdn-uploads/d.jpeg)

### Static Classes 
A class can be made static only if it is a nested class. We cannot declare a top-level class with a static modifier but can declare nested classes as static
