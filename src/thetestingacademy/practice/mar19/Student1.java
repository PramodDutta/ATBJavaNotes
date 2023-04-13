package thetestingacademy.practice.mar19;

public class Student1 {

    // Data Variables
    String name; // Instance Variables
    String courseName;
    long phoneNumber;
    int age;
    String emailId;

    // Static Variables


    // Default Constructor
    Student1(){
        System.out.println("I am called");
    }

    // Param Constructor
    Student1(String name1,String courseName1){ // Pramod
        this.name = name1;
        this.courseName= courseName1;
        System.out.println("I am called with the name -> "+ this.name);
        System.out.println("I am called with the name -> "+ name1);
    }



    // Methods
    void eat(){
        int a = 10; // Local Variable which functions eat()
        System.out.println("I am eating -> " + name);
        System.out.println(a);
    }
    void walk(){
        //System.out.println(a);
        System.out.println(name);
        System.out.println("I am Walking");
    }

    boolean isMale(){
        // Add a logic figure male or female
        return true;
    }




}
