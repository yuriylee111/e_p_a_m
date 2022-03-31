package hierarchyThreeLevels;

public abstract class RoadVehicle extends Vehicle {
    int loadCapacity;
    int speed;

    public RoadVehicle() {

    }

    public RoadVehicle(String model, int tankCapacity, int fuelConsumption, int loadCapacity, int speed) {
        super(model, tankCapacity, fuelConsumption);
        this.loadCapacity = loadCapacity;
        this.speed = speed;
    }

    public void cargoTransportation() {
        System.out.println("Truck " + model + " can transport " + loadCapacity + " tons with speed " + speed + " km/hour.");
    }
}
