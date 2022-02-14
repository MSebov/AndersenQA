package Lesson4.CatsAndDogs;

import Lesson4.CatsAndDogs.Animal;
import Lesson4.CatsAndDogs.Cat;
import Lesson4.CatsAndDogs.Dog;

public class Main {
    public static void main(String[] args) {
        Cat bars = new Cat(200, 0, "Bars");
        Cat sheldon = new Cat(150, 0, "Sheldon");
        bars.run(200);
        bars.swim(10);
        Dog buran = new Dog(500, 10, "Buran");
        buran.run(600);
        buran.run(400);
        buran.swim(5);
        buran.swim(15);
        buran.run(-15);
        System.out.println("Counter of cats: " + Cat.getCount());
        System.out.println("Counter of dogs: " + Dog.getCount());
        System.out.println("Counter of animals: " + Animal.getCount());

    }
}
