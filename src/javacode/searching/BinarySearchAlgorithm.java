package javacode.searching;

import java.util.Scanner;

/*
* Binary search is the most popular Search algorithm.
* It is efficient and also one of the most commonly used techniques that is used to solve problems.

If all the names in the world are written down together in order and you want to search for the position of a specific name,
*  binary search will accomplish this in a maximum of 35 iterations.

Binary search works only on a sorted set of elements. To use binary search on a collection, the collection must first be sorted.

When binary search is used to perform operations on a sorted set,
* the number of iterations can always be reduced on the basis of the value that is being searched.
* Complexity : The time complexity of the below algorithm is O(log2n).
* */
public class BinarySearchAlgorithm {

    public static void main(String[] args) {
        int[] array = new int[]{2, 5, 9, 13, 29, 36, 47, 59};
        println("Enter element to find in array...");
        Scanner in = new Scanner(System.in);
        int item = in.nextInt();
        int result = binarySearchUsingRecursion(array, 0, array.length, item);
        if (result != -1) println("Element is at " + result + " position.");
        else println("Element not found.");
    }

    private static int binarySearchUsingWhileLoop(int[] array, int low, int high, int item) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid != high) {
                if (array[mid] < item) low = mid + 1;
                else if (array[mid] > item) high = mid - 1;
                else return mid;
            } else return -1;
        }
        return -1;
    }

    private static int binarySearchUsingRecursion(int[] array, int low, int high, int item) {
        if (low == high) {
            if (item == array[low - 1]) return low;
        } else {
            int mid = (low + high) / 2;
            if (item == array[mid]) return mid;
            else if (item < array[mid]) return binarySearchUsingRecursion(array, low, mid - 1, item);
            else return binarySearchUsingRecursion(array, mid + 1, high, item);
        }
        return -1;
    }

    private static void println(String message) {
        System.out.println(message);
    }
}
