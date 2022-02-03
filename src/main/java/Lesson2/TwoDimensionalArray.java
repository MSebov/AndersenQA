package Lesson2;
/*
Создать квадратный двумерный целочисленный массив
(количество строк и столбцов одинаковое),
и с помощью цикла(-ов) заполнить его
диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
Определить элементы одной из диагоналей можно по следующему принципу:
индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 */

public class TwoDimensionalArray {
    public static void main(String[] args) {

        int[][] arr = createArray(5);
        printArray(arr);
    }

    public static int[][] createArray(int size) {
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                arr[i][j] = (i == j) || (i + j == size - 1) ? 1 : 0;
        return arr;
    }

    public static void printArray(int[][] arr) {
        for (int[] i : arr) {
            for (int j : i)
                System.out.print("  " + j);
            System.out.println();
        }
    }
}



