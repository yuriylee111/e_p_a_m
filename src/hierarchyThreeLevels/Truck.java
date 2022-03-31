package hierarchyThreeLevels;

public class Truck extends RoadVehicle{
    public Truck(){}

    public Truck(String model, int tankCapacity, int fuelConsumption, int loadCapacity, int speed) {
        super(model, tankCapacity, fuelConsumption,loadCapacity, speed);
    }
}
