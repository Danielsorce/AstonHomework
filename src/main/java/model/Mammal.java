package model;

public abstract class Mammal extends Animal {

    public Mammal(String name, boolean hasFur) {
        super(name);
    }

    public boolean isHasFur() {
        return true;
    }
}