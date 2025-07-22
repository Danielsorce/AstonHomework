package one.Classes;

import one.Interfaces.Breatheble;
import one.Interfaces.Swimmable;
import one.Models.Animal;
import one.Interfaces.Aquatic;

public class Fish extends Animal implements Aquatic, Swimmable, Breatheble {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void liveInWater() {
        System.out.println(getName() + " живет в воде");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " дышит жабрами");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " плавает в воде");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " добывает себе еду");
    }
}
