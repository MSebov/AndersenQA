package Lesson2;
/*
 6.    Задать пустой целочисленный массив длиной 100.
С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
 */

import java.util.Arrays;

public class EmptyArray {
    public static void main(String[] args) {


        int[] arr = new int[100];
        System.out.println("Empty array: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1; // так как мест в массиве всего 100, а нам нужно от 1 до 100, а не от 0 до 99(по условию)

        }
        System.out.println("Complete array: " + Arrays.toString(arr));
    }
}
