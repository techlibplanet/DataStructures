package javacode.sorting;

/*
* The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order)
* from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.

1) The subarray which is already sorted.
2) Remaining subarray which is unsorted.

In every iteration of selection sort, the minimum element (considering ascending order) from the
* unsorted subarray is picked and moved to the sorted subarray.

Following example explains the above steps:

arr[] = 64 25 12 22 11

// Find the minimum element in arr[0...4]
// and place it at beginning
11 25 12 22 64

// Find the minimum element in arr[1...4]
// and place it at beginning of arr[1...4]
11 12 25 22 64

// Find the minimum element in arr[2...4]
// and place it at beginning of arr[2...4]
11 12 22 25 64

// Find the minimum element in arr[3...4]
// and place it at beginning of arr[3...4]
11 12 22 25 64
*
*
* The smallest element is selected from the unsorted array and swapped with the leftmost element,
* and that element becomes a part of the sorted array. This process continues moving unsorted array boundary by one element to the right.

This algorithm is not suitable for large data sets as its average and worst case complexities are of Ο(n2), where n is the number of items.
*
* */

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = new int[]{15, 5, 20, 35, 2, 42, 67, 17, 105};
        print("*****Before Sorting*****\n");
        traverseArray(array);
        selectionSortAlgorithm(array);
        print("*****After Sorting*****\n");
        traverseArray(array);
    }

    private static void selectionSortAlgorithm(int[] array) {
        int temp, min;
        for (int i = 0; i < array.length-1; i++) {
            min=i;
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            temp = array[min];
            array[min] = array[i];
            array[i] = temp;

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
