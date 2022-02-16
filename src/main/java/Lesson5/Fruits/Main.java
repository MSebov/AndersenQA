package Lesson5.Fruits;


public class Main {
    public static void main(String[] args) {


        Apple apple1 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Box<Apple> box1 = new Box<Apple>(apple1);
        box1.getItems();
        box1.getWeight();
        box1.remove(apple1);
        box1.getWeight();
        Box<Orange> box2 = new Box<Orange>(orange1, orange2);

        System.out.println(box1.compare(box2));
        box2.getWeight();


        Box<Orange> box3 = new Box<Orange>();
        box2.transfer(box3);
        System.out.println(box2.compare(box3));
        box3.remove(orange1);
        System.out.println(box2.compare(box3));
        box2.add(orange2);
        System.out.println(box2.compare(box3));

    }
}
