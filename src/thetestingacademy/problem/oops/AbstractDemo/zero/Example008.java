package thetestingacademy.problem.oops.AbstractDemo.zero;

public class Example008 {
    public static void main(String[] args) {

    }
}

abstract class College{
    String name;
    College(String cname){
        this.name = cname;
        System.out.println("cname > " + cname);
    }
}

//class ClassName extends College{
//
//
//    void m1(){
//        System.out.println("Good?");
//    }
//}
