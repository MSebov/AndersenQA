package Lesson4.CatsAndDogs;

import Lesson4.CatsAndDogs.Animal;

public class Cat extends Animal {
    private static int count;

    public Cat(int runStamina, int swimStamina, String name) {
        super(runStamina, swimStamina, name);
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void run(int distance) {
        if (distance > runStamina || distance < 0) {
            System.out.println("Cat " + name + " cant run more than 200 meters");
        } else {
            System.out.println("Cat " + name + " run " + distance + " meters");
        }

    }

    @Override
    public void swim(int distance) {
        System.out.println("Cat " + name + " cant swim");

    }
}
