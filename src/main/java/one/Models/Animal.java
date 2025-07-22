package one.Models;

import lombok.Getter;

public abstract class Animal {
    @Getter
    private final String name;

    protected Animal(String name) {
        this.name = name;
    }

    private final boolean hasSpine = true;

    public abstract void eat();
}
