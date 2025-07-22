package one.Classes;

import one.Interfaces.Breatheble;
import one.Interfaces.Swimmable;
import one.Models.Mammal;

public class Bear extends Mammal implements Breatheble, Swimmable  {


    public Bear(String name) {
        super(name, true);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eст рыбу");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " дышит легкими");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " умеет плавать");
    }
}
