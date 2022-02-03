package Lesson2;
/*
 *** Написать метод, которому на вход подается одномерный массив и число n
 * (может быть положительным, или отрицательным),
 * при этом метод должен сместить все элементы
 * массива на n позиций. Элементы смещаются циклично.
 * Для усложнения задачи нельзя пользоваться вспомогательными массивами.
 * Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
 * при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
 */

import java.util.Arrays;

public class ArrayExtension {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        arrayShift(arr1, -5);


    }

    public static void arrayShift(int[] arr, int n) {
        int temp;
        if (n < 0) {
            for (int i = 0; i < -n; i++) {
                temp = arr[0];
                System.arraycopy(arr, 1, arr, 0, arr.length - 1); // не уверен что можно использовать,
                // но без .arraycopy слишком сложно...
                arr[arr.length - 1] = temp;
            }
            System.out.println(Arrays.toString(arr));
        } else {
            for (int i = 0; i < n; i++) {
                temp = arr[arr.length - 1];
                System.arraycopy(arr, 0, arr, 1, arr.length - 1);
                arr[0] = temp;

            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
