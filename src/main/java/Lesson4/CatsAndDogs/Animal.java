package Lesson4.CatsAndDogs;

public abstract class  Animal {
    protected String name;
    protected int runStamina;
    protected int swimStamina;
    private static int count;

    public Animal(int runStamina, int swimStamina, String name) {
        this.name = name;
        this.runStamina = runStamina;
        this.swimStamina = swimStamina;
        count++;
    }


    public static int getCount() {
        return count;
    }

    protected void run(int distance) {
        //System.out.println("Animal run " + distance + " meters");
    }

    protected void swim(int distance) {
         //System.out.println("Animal swim " + distance + " meters");
    }
}
