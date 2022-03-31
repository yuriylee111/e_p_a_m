package hierarchyThreeLevels;

public abstract class AirVehicle extends Vehicle {
    int passengersCapacity;
    int distanceFlight;

    public AirVehicle() {

    }

    public AirVehicle(String model, int tankCapacity, int fuelConsumption, int passengersCapacity, int distanceFlight) {
        super(model, tankCapacity, fuelConsumption);
        this.passengersCapacity = passengersCapacity;
        this.distanceFlight = distanceFlight;
    }

    public void passengersTransportation() {
        System.out.println("Plane " + model + " can transport " + passengersCapacity + " passengers on " + distanceFlight + " km.");
    }

}