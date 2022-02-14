package Lesson4.CatsAndPlates;

import java.util.Scanner;

public class Plate {
    Scanner scanner = new Scanner(System.in);
    public int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int amount) {
        food -= amount;
    }

    public void increaseFood(int amount) {
        food += amount;
    }

    public void info() {
        System.out.println("There are: " + food + " food in the plate");
    }

    public void addFood(int amount, Plate p) {
        System.out.println("How many food you want to add to the plate?");
        amount = scanner.nextInt();
        p.increaseFood(amount);
        System.out.println("We added " + amount + " food to the plate");
    }
}
