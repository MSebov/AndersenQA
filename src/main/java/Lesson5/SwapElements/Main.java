package Lesson5.SwapElements;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] stringArr = {" one ", " two ", " three ", " four ", " five ", " six ", " seven "};

        System.out.println("Original integer array: " + Arrays.toString(intArr));
        System.out.println("Original string array: " + Arrays.toString(stringArr));

        swapElements(intArr, 0, 2);
        swapElements(stringArr, 5, 3);


        System.out.println("Swap integer array: " + Arrays.toString(intArr));
        System.out.println("Swap string array: " + Arrays.toString(stringArr));

    }

    private static void swapElements(Object[] arr, int num1, int num2) {
        if (num1 < 0 || num1 > arr.length ||
                num2 < 0 || num2 > arr.length || num1 == num2) {
        }
        Object temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}
