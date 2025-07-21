package Iml;

import model.Mammal;

public class Bear extends Mammal {
    public Bear() {
        super("Медведь", true);
    }

    @Override
    public void eat() {
        System.out.println("Ест рыбу");
    }
}
