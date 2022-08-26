package thetestingacademy.oops.inheritence.example.Multilevel;

public class Vehicle {

    int seats;
    String engineType;
    int speed;

    Vehicle(int speed){
        this.speed = speed;
    }

    void topSpeed(){
        System.out.println("Top Speed"+this.speed);
    }
}


