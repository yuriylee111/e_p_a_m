package hierarchyThreeLevels;

public class Main {
    public static void main(String[] args) {

        Truck goodsTruck = new Truck("Scania R440", 1000, 35, 30, 80);

        System.out.println(goodsTruck.toString() );
        goodsTruck.canDriveFullTank();
        goodsTruck.cargoTransportation();

        System.out.println("-----------");

        Plane airplane = new Plane("Boeing-747", 200000, 1200,600, 14_000);

        System.out.println(airplane.toString() );
        airplane.canDriveFullTank();
        airplane.passengersTransportation();
    }
}
