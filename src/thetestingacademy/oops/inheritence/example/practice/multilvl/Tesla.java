package thetestingacademy.oops.inheritence.example.practice.multilvl;

public class Tesla extends Car{
    Tesla(int speed) {
        super(speed);
    }


    void topSpeed() {
        System.out.println("I am Tesla");
    }
}
