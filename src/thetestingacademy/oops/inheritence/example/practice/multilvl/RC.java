package thetestingacademy.oops.inheritence.example.practice.multilvl;

public class RC {

    public static void main(String[] args) {

            Tesla t = new Tesla(300);
            t.topSpeed();

            Car c = new Car(250);
            c.topSpeed();

            Vehicle v = new Vehicle(150);
            v.topSpeed();


    }
}
