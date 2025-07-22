package two.Classes;

import two.Intefaces.EngineStart;
import two.Intefaces.FuelCapacity;
import two.Intefaces.HasPropeller;
import two.Models.WaterVehicle;

public class Boat extends WaterVehicle implements HasPropeller, EngineStart, FuelCapacity {

    public Boat(String name) {
        super(name);
    }

    @Override
    public void FuelCapacity(double fuelCapacity) {
        System.out.println("Топлива: "+ fuelCapacity);
    }

    @Override
    public void Start() {
        System.out.println("Двигатель заводится");
    }

    @Override
    public void SpinPropeller() {
     System.out.println("Гребной винт набирает обороты");
    }

    @Override
    public  void move() {
        System.out.println(getName() + " плывёт");
    }
}