package two.Models;

public abstract class LandVehicle extends Vehicle {

    private final int wheelCount;

    protected LandVehicle(String name, int wheelCount) {
        super(name);
        this.wheelCount = wheelCount;
    }
}