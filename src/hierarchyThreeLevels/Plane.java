package hierarchyThreeLevels;

public class Plane extends AirVehicle{
    public Plane(){}

    public Plane(String model, int tankCapacity, int fuelConsumption, int passengersCapacity, int distanceFlight) {
        super(model, tankCapacity, fuelConsumption, passengersCapacity, distanceFlight);
    }
}
