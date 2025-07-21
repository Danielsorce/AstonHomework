package Interf;

public interface Aquatic {
    Object getName();

    default void liveInWater() {
        System.out.printf("%s liveInWater(): %n", this.getName());
    }
}
