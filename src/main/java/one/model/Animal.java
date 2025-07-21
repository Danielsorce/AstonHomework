package one.model;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class Animal {
    private final String name;
    private final boolean hasSpine = true;

    public abstract void eat();
}
