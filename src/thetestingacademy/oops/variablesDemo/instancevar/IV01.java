package thetestingacademy.oops.variablesDemo.instancevar;

public class IV01 {public static void main(String args[]){
    Person h=new Person();
    Person h2=new Person(23);
    Person h3=new Person(23,true);
    System.out.println(h.a);
    System.out.println(h2.a);
    System.out.println(h3.a);
    System.out.println(h3.b);
//    System.out.println(h.b);
//    h.a=99;
//    System.out.println(h.a);
}
}

// Class laoders
// Constructor
// Use the instance variable



class Person {
    int a;
    boolean b;

    // Default
    Person(){
        this.a = 10;
    }

    // Parameter Constructor
    Person(int b){
        this.a = b; //  h2.a
    }

    Person(int b,boolean a){
       this.a = b;
       this.b = a;
    }
}
