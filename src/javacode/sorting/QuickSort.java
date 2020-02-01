package javacode.sorting;

/*
*
* Quick sort is a highly efficient sorting algorithm and is based on partitioning of array of data into smaller arrays.
* A large array is partitioned into two arrays one of which holds values smaller than the specified value, say pivot,
* based on which the partition is made and another array holds values greater than the pivot value.

Quicksort partitions an array and then calls itself recursively twice to sort the two resulting subarrays.
* This algorithm is quite efficient for large-sized data sets as its average and worst-case complexity are O(nLogn) and O(n2), respectively.*/

public class QuickSort {

    public static void main(String[] args) {
        int[] array = new int[]{15, 5, 20, 35, 2, 42, 67, 17};
        print("*****Before Sorting*****\n");
        traverseArray(array);
        quickSortRecursion(array, 0, array.length - 1);
        print("*****After Sorting*****\n");
        traverseArray(array);
        
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[(low + high) / 2];
        while (low <= high) {
            while (array[low] < pivot) {
                low++;
            }
            while (array[high] > pivot) {
                high--;
            }
            if (low <= high) {
                int temp = array[low];
                array[low] = array[high];
                array[high] = temp;

                low++;
                high--;
            }
        }
        return low;
    }

    private static void quickSortRecursion(int[] array, int low, int high) {
        // pi is the partition index
        int pi = partition(array, low, high);
        if (low < pi - 1) {
            partition(array, low, pi - 1);
        }

        if (pi < high) {
            partition(array, pi, high);
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
