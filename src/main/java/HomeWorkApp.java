public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        System.out.println("-----------");
        checkSumSign();
        System.out.println("-----------");
        printColor();
        System.out.println("-----------");
        compareNumbers();

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 2;
        int b = 1;
        int sum= a + b;
        if (sum >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 101;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        } else {
            System.out.println("Значение value" + value + "Он суда никогда не зайдет"); // можно обойтись без блока Else
        }

    }

    public static void compareNumbers() {
        int a = 5;
        int b = 3;
        if (a >= b) {
            System.out.println("a >= b | " + a + " >= " + b);
        } else {
            System.out.println("a < b | " + a + " < " + b);
        }
    }
}