package one;


import one.Classes.Bear;
import one.Classes.Cat;
import one.Classes.Fish;
import one.Classes.Whale;
import one.Models.Animal;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Bear("Белый медведь"),
                new Cat("Короткошерстный британец"),
                new Fish("Карп"),
                new Whale("Белуга")
        };

        for (Animal a : animals) {
            System.out.println("Животное: " + a.getName());
            a.eat();
            //продолжение следует
        }
    }
}
