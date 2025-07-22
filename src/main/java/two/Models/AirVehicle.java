package two.Models;

public abstract class AirVehicle extends Vehicle {

    private final double WingSpan;

    protected AirVehicle(String name, double wingSpan) {
        super(name);
        this.WingSpan = wingSpan;
    }
}