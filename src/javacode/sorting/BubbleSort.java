package javacode.sorting;

/*
 * Bubble sort is a simple sorting algorithm.
 * This sorting algorithm is comparison-based algorithm in which each pair of adjacent elements is compared and the elements are swapped if they are not in order.
 * This algorithm is not suitable for large data sets as its average and worst case complexity are of Ο(n2) where n is the number of items.
 *
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.*/

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[]{15, 5, 20, 35, 2, 42, 67, 17};
        print("*****Before Sorting*****\n");
        traverseArray(array);
        bubbleSortAlgorithm(array);
        print("*****After Sorting*****\n");
        traverseArray(array);
    }

    private static void bubbleSortAlgorithm(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length; j++)
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
    }

    private static void traverseArray(int[] array) {
        for (int value : array) print(value + " ");
        print("\n");
    }

    private static void print(String message) {
        System.out.print(message);
    }
}
