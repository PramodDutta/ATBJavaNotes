package thetestingacademy.oops.inheritence.example.SingleInheritance;

public class MainClass {

    public static void main(String[] args) {

        Java java = new Java(18,"RK","Lambda Expression");
        java.printDetails();


        Python p = new Python(3,"RK2","HTTP");
        p.printPython();

        sleep();

        Java j = new Java();
        Java j2 = new Java();
        j2=j;





    }

    static void sleep(){

    }
}
