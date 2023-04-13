package thetestingacademy.oops.basics;

public class StudentATB {
    // Data Variable
    String name;
    String courseName;
    long phoneNumber;
    String emailId;
    byte age;
    String cName;


    // Methods
    void eat(){
        System.out.println("Student is eating");
    }

    void sleep(){
        System.out.println("Student is sleeping");
    }


    void walk(){
        System.out.println("Student is walking");
    }

    void study(){
        System.out.println("Student is studying");
    }

    int add(int a, int b){
        return a+b;
    };

    double add(double a, double b){
        return a+b;
    };

    int withdrawMoney(){
        System.out.println("Student is withdrawing");
        return 100;
    }







}
