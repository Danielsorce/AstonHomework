package two.Classes;

import lombok.EqualsAndHashCode;
import two.Intefaces.CanTranportCarryCargo;
import two.Intefaces.EngineStart;
import two.Intefaces.FuelCapacity;
import two.Intefaces.HasPropeller;
import two.Models.AirVehicle;

@EqualsAndHashCode(callSuper = true)
public class Helicopter extends AirVehicle implements HasPropeller, FuelCapacity, EngineStart, CanTranportCarryCargo {

    private final int propellers;

    public Helicopter(String name, int propellers) {
        super(name, 0);
        this.propellers = propellers;
    }

    @Override
    public void FuelCapacity(double fuelCapacity) {
        System.out.println("Топлива: " +  fuelCapacity);
    }

    @Override
    public void Start() {
        System.out.println("Двигатель запускается");
    }

    @Override
    public void SpinPropeller() {
        System.out.println("Винт раскручивается");
    }

    @Override
    public void CarryCargo(double mass) {
        System.out.println("Масса груза: " + mass);
    }

    @Override
    public void move() {
        System.out.println(getName() + " взлетает вертикально");
    }
}