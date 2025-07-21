package Iml;

import model.Mammal;

public class Cat extends Mammal {
    public Cat() {
        super("Кот", true);
    }

    @Override
    public void eat() {
        System.out.println("Ест рыбу");
    }
}