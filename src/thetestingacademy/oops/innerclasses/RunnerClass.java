package thetestingacademy.oops.innerclasses;

public class RunnerClass {

    public static void main(String[] args) {
        Pramod p = new Pramod();
        Pramod.Ipad pi = p.new Ipad();
        pi.eating();
    }

}

// Class Members
class Pramod{
    int age  = 31; // Data Memebers / Instances Variables

     // Methods
     void eay(){
        System.out.println("I am eating");
     }

    class Ipad{
        void eating(){
            System.out.println("I am IPAD");
            System.out.println(age);
        }
    }



}