package thetestingacademy.oops.inheritence.example.Multilevel;

public class Tesla extends Car {

    Tesla(int i){
        super(i);
    }

    void topSpeed(){
        System.out.println("Yo I am Tesla");
    }
}
