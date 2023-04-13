package designpattern.builderPattern;

public class VehicleDemo{
    public static void main(String[] args) {
        Vehicle cycle = new Vehicle.VehicleBuilder("2","200cc").build();
        Vehicle truck = new Vehicle.VehicleBuilder("4","2000cc").setSeatBelt("Yes").build();
        System.out.println(cycle);
        System.out.println(truck);
    }
}


class Vehicle {

    String tyres;
    String engines;
    String seatBelt;

    public String getTyres() {
        return this.tyres;
    }

    public String getEngines() {
        return this.engines;
    }

    public String getSeatBelt() {
        return this.seatBelt;
    }

    public Vehicle(VehicleBuilder builder){
        this.engines = builder.engines;
        this.tyres = builder.tyres;
        this.seatBelt= builder.seatBelt;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "tyres='" + tyres + '\'' +
                ", engines='" + engines + '\'' +
                ", seatBelt='" + seatBelt + '\'' +
                '}';
    }

    static class VehicleBuilder{
        String tyres;
        String engines;
        String seatBelt;

        public VehicleBuilder(String tyres,String engines){
            this.engines = engines;
            this.tyres =  tyres;
        }

        public VehicleBuilder setSeatBelt(String seatBelt){
            this.seatBelt = seatBelt;
            return this;
        }

        public Vehicle build(){
            return new Vehicle(this);
        }
    }
}


