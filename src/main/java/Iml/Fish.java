package Iml;

import lombok.Getter;
import model.Animal;
import Interf.Aquatic;

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
