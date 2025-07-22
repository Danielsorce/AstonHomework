package two.Classes;

import two.Intefaces.CanTranportCarryCargo;
import two.Intefaces.EngineStart;
import two.Intefaces.FuelCapacity;
import two.Models.LandVehicle;

public class Truck extends LandVehicle implements EngineStart, FuelCapacity, CanTranportCarryCargo {

    public Truck(String name, int wheelCount) {
        super(name, wheelCount);
    }

    @Override
    public void CarryCargo(double mass) {
        System.out.println("Вес груза: " + mass);
    }

    @Override
    public void Start() {
        System.out.println("Двигатель заводится");
    }

    @Override
    public void FuelCapacity(double fuelCapacity) {
        System.out.println("Топлива: " + fuelCapacity);
    }

    @Override
    public void move() {
        System.out.println(getName() + " едет по дороге");
    }
}