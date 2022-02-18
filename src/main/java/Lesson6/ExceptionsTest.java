package Lesson6;

public class ExceptionsTest {
    public static void main(String[] args) {

        String[][] arr = new String[][]{
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}};
        String[][] arr1 = new String[][]{
                {"1", "1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}};
        String[][] arr2 = new String[][]{
                {"1", "Any String", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}};
        try {
            try {
                int result = myArrayException(arr);
                //int result1 = myArrayException(arr1);
                //int result2 = myArrayException(arr2);

                System.out.println(result);
                //System.out.println(result1);
                //System.out.println(result2);
            } catch (MyArraySizeException e) {
                e.printStackTrace();
            }
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

    }

    public static int myArrayException(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException("Index out of bounds");
        }
        for (String[] strings : arr) {
            if (strings.length != 4) {
                throw new MyArraySizeException("Index out of bounds");
            }
            for (String string : strings) {
                try {
                    sum = sum + Integer.parseInt(string);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Required type: int   Provided: String");
                }
            }
        }
        return sum;
    }

    private static class MyArraySizeException extends Exception {
        public MyArraySizeException(String message) {
            super(message);
        }
    }

    private static class MyArrayDataException extends Exception {
        public MyArrayDataException(String message) {
            super(message);
        }
    }
}
