package atb.classdemo.hasA;

public class RunnerClass {

    public static void main(String[] args) {

        Vehicle v = new Vehicle(1,"Tesla");
        Vehicle v2 = new Vehicle(2,"I10");
        Driver d = new Driver("Pramod",v2);
        String result = d.showDriverDescription(v2);
        System.out.println(result);

    }
}
