package two.Classes;

import two.Intefaces.CanTranportCarryCargo;
import two.Intefaces.EngineStart;
import two.Intefaces.FuelCapacity;
import two.Intefaces.HasPropeller;
import two.Models.WaterVehicle;

public class Tanker extends WaterVehicle implements FuelCapacity, CanTranportCarryCargo, HasPropeller, EngineStart {

    public Tanker(String name) {
        super(name);
    }

    @Override
    public void FuelCapacity(double fuelCapacity) {
        System.out.println("Топлива: "+ fuelCapacity);
    }

    @Override
    public void Start() {
        System.out.println("Двигатель запускается");
    }

    @Override
    public void SpinPropeller() {
        System.out.println("Гребной винт набирает обороты");
    }

    @Override
    public void CarryCargo(double mass) {
        System.out.println("Вес груза: " + mass);
    }

    @Override
    public void move() {
        System.out.println(getName() + " перевозит грузы по морю");
    }
}