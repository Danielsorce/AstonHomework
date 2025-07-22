package two.Models;

public abstract class Vehicle {
    private final String name;

    protected Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void move();
}
