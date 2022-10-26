package thetestingacademy.oops.constructors;

public class CopyConstructor {

    public static void main(String[] args) {
        Student student = new Student("Pramod",34);
        Student student2 = new Student(student);
        student.printInfo();
        student2.printInfo();
    }

}

class Student {
    String name;
    int age;



    Student(String name,int age){
        this.age = age ;
        this.name = name;
    }

    void printInfo(){
        System.out.println(this.age + " --- " + this.name);
    }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
}
