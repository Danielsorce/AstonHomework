package two.Classes;

import two.Intefaces.*;
import two.Models.AirVehicle;

public class Airplane extends AirVehicle implements CanTranportCarryCargo, HasPropeller, HasWings, FuelCapacity, EngineStart {

    public Airplane(String name, double wingSpan) {
        super(name, wingSpan);
    }
    @Override
    public void FuelCapacity(double fuelCapacity) {
        System.out.println("Топлива: " +  fuelCapacity);
    }

    @Override
    public void Start() {
        System.out.println("Двигатели запускаются");
    }

    @Override
    public void SpinPropeller() {
        System.out.println("Крыльчатка набирает обороты");
    }

    @Override
    public void WingsTesting() {
        System.out.println("Крылья проверяются");
    }

    @Override
    public void CarryCargo(double mass) {
        System.out.println("Масса груза: " +  mass);
    }

    @Override
    public  void move() {
        System.out.println(getName() + " взлетает горизонтально");
    }
}