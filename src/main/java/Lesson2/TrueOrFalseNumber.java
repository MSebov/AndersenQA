package Lesson2;
/*
 3.     Написать метод, которому в качестве параметра передается целое число.
 Метод должен вернуть true, если число отрицательное,
 и вернуть false если положительное. Замечание: ноль считаем положительным числом.
 */

public class TrueOrFalseNumber {
    public static void main(String[] args) {
        System.out.println(trueOrFalseNumber(5));

    }

    public static boolean trueOrFalseNumber(int num) {
        boolean compareNumbers;
        if (num < 0) {
            System.out.println("Your number is " + num + " number is negative, operation is failed ");
            compareNumbers = false;
        } else {
            System.out.println("Your number is " + num + " number is positive, operation complete ");
            compareNumbers = true;
        }
        return compareNumbers;
    }
}
