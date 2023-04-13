package thetestingacademy.oops.basics;

public class RunnerClass {
    public static void main(String[] args) {
        StudentATB student1 = new StudentATB(); // Ref, Object
        student1.name = "Kamelesh";

        StudentATB student2 = new StudentATB();
        StudentATB student3 = student2;
        student2.name  = "Sonam";


    }
}
