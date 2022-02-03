package Lesson2;
/*
4.     Написать метод, которому в качестве аргументов
передается строка и число, метод должен отпечатать в
консоль указанную строку, указанное количество раз;

         * Написать метод, который определяет,
         является ли год високосным, и возвращает boolean
         (високосный - true, не високосный - false).
         Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */

public class LeapOrCommonYear {
    public static void main(String[] args) {
        stringCounter("I do my home task", 3);
        leapOrCommonYear(1);
        leapOrCommonYear(4);
        leapOrCommonYear(5);
        leapOrCommonYear(100);
        leapOrCommonYear(200);
        leapOrCommonYear(400);
        leapOrCommonYear(500);
        leapOrCommonYear(1200);
        leapOrCommonYear(1300);


    }

    public static void stringCounter(String myString, int counter) {
        if (counter <= 0) {
            System.out.println("Please input positive number more than zero");
        } else {
            for (int i = 0; i < counter; i++) {
                System.out.println(myString);

            }

        }

    }

    public static boolean leapOrCommonYear(int year) {
        boolean yearCounter;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            yearCounter = true;
            System.out.println("Year " + year + " is leap operation is: " + yearCounter);
        } else {
            yearCounter = false;
            System.out.println("Year " + year + " is common operation is: " + yearCounter);

        }
        return yearCounter;

    }
}
