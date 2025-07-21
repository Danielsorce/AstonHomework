package Iml;

import lombok.Getter;
import Interf.Aquatic;
import model.Mammal;

@Getter
public abstract class Whale extends Mammal implements Aquatic {
    private Object name;

    public Whale() {
        super("Кит", false);
    }

    @Override
    public void liveInWater() {
    }
    @Override
    public void eat() {
        System.out.println("Ест планктонов");
    }
}
