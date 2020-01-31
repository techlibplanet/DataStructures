package javacode.sorting;

/*
* Insertion Sort
Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
* This is an in-place comparison-based sorting algorithm.
*
* The array is searched sequentially and unsorted items are moved and inserted into the sorted sub-list (in the same array).
* This algorithm is not suitable for large data sets as its average and worst case complexity are of Ο(n2), where n is the number of items.
*
* Algorithm
Now we have a bigger picture of how this sorting technique works, so we can derive simple steps by which we can achieve insertion sort.

Step 1 − If it is the first element, it is already sorted. return 1;
Step 2 − Pick next element
Step 3 − Compare with all elements in the sorted sub-list on left side
Step 4 − Shift all the elements in the sorted sub-list that is greater than the
         value to be sorted
Step 5 − Insert the value
Step 6 − Repeat until list is sorted*/

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = new int[]{15, 5, 20, 35, 2, 42, 67, 17, 105};
        print("*****Before Sorting*****\n");
        traverseArray(array);
        insertionSortAlgorithm(array);
        print("*****After Sorting*****\n");
        traverseArray(array);
    }

    private static void insertionSortAlgorithm(int[] array) {
        int tempValue, index;
        for (int i = 1; i < array.length; i++) {
            tempValue = array[i];
            index = i;
            while (index > 0 && array[index - 1] > tempValue) {
                array[index] = array[index - 1];
                index = index - 1;
            }
            array[index] = tempValue;
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
