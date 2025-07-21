package one.Iml;

import lombok.Getter;
import one.model.Animal;
import one.Interf.Aquatic;

@Getter
public abstract class Fish extends Animal implements Aquatic {
    private Object name;

    public Fish(String name) {
        super(name);
    }

    @Override
    public void liveInWater() {
        System.out.println("Живет в воде");
    }
}
