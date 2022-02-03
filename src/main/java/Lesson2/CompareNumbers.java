package Lesson2;
/*
1.     Написать метод,
принимающий на вход два целых числа и проверяющий,
что их сумма лежит в пределах от 10 до 20 (включительно),
если да – вернуть true, в противном случае – false.
 */

public class CompareNumbers {
    public static void main(String[] args) {
        compareNumbers(20, 0);
        compareNumbers(1, 5);

    }

    public static boolean compareNumbers(int num1, int num2) {
        int sum = num1 + num2;
        boolean compare;
        if (sum >= 10 && sum <= 20) {
            compare = true;
            System.out.println("Sum of numbers is: " + sum + " its more than 9 and less than 21");
        } else {
            System.out.println("Sum of numbers is: " + sum + " its less than 10 or more than 20");
            compare = false;
        }
        return compare;
    }
}
