package thetestingacademy.oops.variablesDemo.instancevar;

public class IV01 {public static void main(String args[]){
    Person h=new Person();
    System.out.println(h.a);
    h.a=99;
    System.out.println(h.a);
}
}
class Person {
    int a;
}
