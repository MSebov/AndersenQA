package Lesson2;
/*
 * 9.    * Написать метод, принимающий на вход два аргумента:
 * len и initialValue, и возвращающий одномерный
 * массив типа int длиной len, каждая ячейка которого равна initialValue;
 */

import java.util.Arrays;

public class ArrayInitialValue {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayBuilder(10, 155)));

    }

    public static int[] arrayBuilder(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;

        }
        return arr;
    }

}
