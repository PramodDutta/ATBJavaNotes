package thetestingacademy.oops.inheritence.hasA;

public class Driver {

    private String name;
    private Vehicle vehicle;

    public String showDriverDescription(Vehicle v) {

        return  "Driver{" +
                "name='" + name + '\'' +
                ", vehicle=" + v.show() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Driver(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }


}
