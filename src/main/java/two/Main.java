package two;

import two.Classes.*;
import two.Models.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Airplane("Ил-96", 64),
                new Helicopter("Ка-32", 2),
                new Boat("Катер-100"),
                new Tanker("Танкер 'Россия'"),
                new Truck("КамАЗ", 6),
                new Taxi("Такси", 4)
        };

        for (Vehicle v : vehicles) {
            System.out.println("Название: " + v.getName());
            v.move();
            // продолжение следует
        }
    }
}