package one.Classes;

import one.Interfaces.Aquatic;
import one.Interfaces.Breatheble;
import one.Interfaces.Swimmable;
import one.Models.Mammal;

public class Whale extends Mammal implements Aquatic, Breatheble, Swimmable {

    public Whale(String name) {
        super(name, false);
    }

    @Override
    public void liveInWater() {
        System.out.println(getName() + " живет в воде");
    }

    @Override
    public void breathe() {
        System.out.println(getName() +" дышит через легкие");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " плавает в воде");
    }
    @Override
    public void eat() {
        System.out.println(getName() + " ест планктонов");
    }
}
