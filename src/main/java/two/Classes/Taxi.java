package two.Classes;

import two.Intefaces.CanTranportCarryCargo;
import two.Intefaces.EngineStart;
import two.Intefaces.FuelCapacity;
import two.Models.LandVehicle;

public class Taxi extends LandVehicle implements CanTranportCarryCargo, EngineStart, FuelCapacity {

    public Taxi(String name, int wheelCount) {
        super(name, wheelCount);
    }

    @Override
    public void FuelCapacity(double fuelCapacity) {
        System.out.println("Топлива: " + fuelCapacity);
    }

    @Override
    public void Start() {
        System.out.println("Двигатель заводится");
    }

    @Override
    public void CarryCargo(double mass) {
        System.out.println("Вес груза: " + mass);
    }

    @Override
    public void move() {
        System.out.println(getName() + " перевозит пассажиров");
    }
}