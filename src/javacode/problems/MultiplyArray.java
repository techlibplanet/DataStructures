package javacode.problems;

public class MultiplyArray {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int total = 1;
        for (int value : arr) {
            total *= value;
        }
        printArray(multiplyRecursion(arr, 0, total));
    }

    private static int[] multiplyRecursion(int[] array, int index, int total) {
        if (index < array.length) {
            array[index] = total / array[index];
            index++;
            multiplyRecursion(array, index, total);
        }
        return array;
    }

    private static void print(String message) {
        System.out.print( message+ " ");
    }

    private static void printArray(int[] arr) {
        for (int value : arr) {
            print(" " + value);
        }
    }
}
