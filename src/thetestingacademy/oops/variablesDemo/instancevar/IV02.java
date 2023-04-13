package thetestingacademy.oops.variablesDemo.instancevar;

public class IV02 {public static void main(String args[]){
    Person02 h1=new Person02();
    Person02 h2=new Person02();
    System.out.println(h1.a+"\t"+h2.a);
    h1.a=99;
    System.out.println(h1.a+"\t"+h2.a);
}
}
class Person02 {
    int a;
}
