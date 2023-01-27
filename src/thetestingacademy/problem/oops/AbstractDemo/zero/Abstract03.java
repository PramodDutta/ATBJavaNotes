package thetestingacademy.problem.oops.AbstractDemo;


//Stop Object creation
public class Abstract03 {
    public static void main(String[] args) {
        System.out.println(NoObject.collegeName);
        System.out.println(NoObject.printName());
        // NoObject no = new NoObject(); Not possible
    }
}

abstract class NoObject{
    static String collegeName = "AIT";
    static String printName(){
        System.out.println(collegeName);
        return collegeName;
    }
}
