package Lesson4.CatsAndDogs;

import Lesson4.CatsAndDogs.Animal;

public class Dog extends Animal {
    private static int count;

    public Dog(int runStamina, int swimStamina, String name) {
        super(runStamina, swimStamina, name);
        count++;
    }

    public static int getCount() {
        return count;
    }


    @Override
    public void run(int distance) {
        if (distance > runStamina || distance < 0) {
            System.out.println("Dog " + name + " cant run more than 500 meters or less than 0");
        } else {
            System.out.println("Dog " + name + " run " + distance + " meters");
        }
        super.run(distance);
    }

    @Override
    public void swim(int distance) {
        if (distance > swimStamina || distance < 0) {
            System.out.println("Dog " + name + " cant swim more than 10 meters or less than 0");
        } else {
            System.out.println("Dog " + name + " swim " + distance + " meters");
        }
        super.swim(distance);
    }
}
