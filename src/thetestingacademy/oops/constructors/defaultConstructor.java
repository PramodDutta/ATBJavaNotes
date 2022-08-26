package thetestingacademy.oops.constructors;

public class defaultConstructor {
    public static void main(String[] args) {
        new Person();
    }
}

class Person{

    Person(){
        System.out.println(getClass().getSimpleName()+" Constructor Called!!");
    }
}
