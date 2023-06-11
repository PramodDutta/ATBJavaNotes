package thetestingacademy.oops.basics.demo;

public class PersonATB {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Vishal";
        p1.age = 29;
        p1.gender = "Male";

        p1.run();
        p1.sleep();
        p1.talk();



    }
}

class Person{
    // Attributes

    // Instance Variables
    String name;
    int age;
    String gender;
    double height;
    long phone;
    String address;



    // Instance Methods
    void run(){
    }

    void sleep(){
        // write the code
    }

    void talk(){

    }


    // Static Method, Attribute, inner Classes






}