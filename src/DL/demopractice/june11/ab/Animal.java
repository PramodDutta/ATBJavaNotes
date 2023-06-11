package DL.demopractice.june11.ab;

// Abstract - Not complete


public abstract class Animal {

    Animal(){
        System.out.println("Animal con");
    }

    void m1(){
        System.out.println("I am normal");
    }

    // Incomplete Method - somebody will complete me
    abstract void say();
    abstract void say2();

    abstract void fly();


}
