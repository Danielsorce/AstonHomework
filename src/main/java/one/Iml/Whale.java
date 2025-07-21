package one.Iml;

import lombok.Getter;
import one.Interf.Aquatic;
import one.model.Mammal;

@Getter
public abstract class Whale extends Mammal implements Aquatic {
    private Object name;

    public Whale() {
        super("Кит", false);
    }

    @Override
    public void liveInWater() {
        System.out.println("Живет в воде");
    }
    @Override
    public void eat() {
        System.out.println("Ест планктонов");
    }
}
