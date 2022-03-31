package hierarchyThreeLevels;

public abstract class Vehicle {
    String model;
    int tankCapacity;
    int fuelConsumption;

    public Vehicle() {
    }

    public Vehicle(String model) {
        this.model = model;
    }

    public Vehicle(String model, int tankCapacity, int fuelConsumption) {
        this.model = model;
        this.tankCapacity = tankCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public void canDriveFullTank() {
        System.out.println(model + " can pass " + (tankCapacity / fuelConsumption * 100) + " km without refueling." );
    }

    @Override
    public String toString() {
        return "Vehicle model = " + model + ": " + "\n\t tankCapacity = " + tankCapacity + " litres"
                + ", fuelConsumption = " + fuelConsumption + " litres for 100 km.";
    }
}
