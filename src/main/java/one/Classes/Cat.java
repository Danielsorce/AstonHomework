package one.Classes;

import one.Interfaces.Breatheble;
import one.Interfaces.Swimmable;
import one.Models.Mammal;

public class Cat extends Mammal implements Breatheble, Swimmable {

    public Cat(String name) {
        super(name, true);
    }

    @Override
    public void eat() {
        System.out.println(getName() +" ест рыбу");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " дышит лёгкими");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " умеет плавать в воде");
    }
}