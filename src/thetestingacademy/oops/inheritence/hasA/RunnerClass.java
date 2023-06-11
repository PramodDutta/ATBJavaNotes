package thetestingacademy.oops.inheritence.hasA;

public class RunnerClass {

    public static void main(String[] args) {

        Vehicle v = new Vehicle(1,"Tesla");
        Vehicle v2 = new Vehicle(2,"I10");

        Driver d = new Driver("Pramod",v2);
        Driver d2 = new Driver("Pratik",v);


        String result = d.showDriverDescription(v2);
        String result2 = d2.showDriverDescription(v);

        System.out.println(result);
        System.out.println(result2);

    }
}
