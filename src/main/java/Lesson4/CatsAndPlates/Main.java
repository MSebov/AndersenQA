package Lesson4.CatsAndPlates;


public class Main {
    public static void main(String[] args) {


        Cat buran = new Cat("Buran", 25, false);
        Cat taifun = new Cat("Taifun", 15, false);
        Cat uragan = new Cat("Uragan", 7, false);
        Cat smerch = new Cat("Smerch", 11, false);
        Cat arkasha = new Cat("Prosto Arkasha", 3, false);


        Cat[] allCats = new Cat[5];
        allCats[0] = buran;
        allCats[1] = taifun;
        allCats[2] = uragan;
        allCats[3] = smerch;
        allCats[4] = arkasha;


        Plate plate = new Plate(35);
        plate.info();
        for (int i = 0; i < allCats.length; i++) {
            if (allCats[i].hunger == false && allCats[i].appetite < plate.food) {
                allCats[i].eat(plate);
                allCats[i].hunger = true;
                System.out.println("Cat " + allCats[i].name + " eats successful!");
            } else {
                System.out.println("Cat " + allCats[i].name + " cant eat there is no enough food");
            }
        }
        plate.info();
        plate.addFood(50, plate);
        plate.info();

        buran.eat(plate);
        System.out.println("Cat " + buran.name + " eats after we added food to the plate");
        plate.info();

    }
}



