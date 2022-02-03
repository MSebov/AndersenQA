package Lesson2;
/*
2.     Написать метод, которому в качестве параметра передается целое число,
метод должен напечатать в консоль,
положительное ли число передали или отрицательное.
Замечание: ноль считаем положительным числом.
 */

public class CheckNumber {
    public static void main(String[] args) {
        checkNumbers(55);
        checkNumbers(-10);

    }

    public static void checkNumbers(int num) {
        if (num < 0) {
            System.out.println("Your number is " + num + " its negative number ");
        } else {
            System.out.println("Your number is " + num + " its positive number ");
        }
    }
}
