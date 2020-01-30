package javacode.searching;

import java.util.Scanner;

/*
 *****Linear search or Sequential Algorithm*****
 * Linear Search - Linear search is used to search a key element from multiple elements.
 * Linear search is less used today because it is slower than binary search and hashing.
 * Complexity : The time complexity of the below algorithm is O(n).
 */

public class LinearSearchAlgorithm {

    public static void main(String[] args) {
        int[] array = new int[]{15, 5, 20, 35, 2, 42, 67, 17};
        println("Enter element to find in array...");
        Scanner in = new Scanner(System.in);
        int findElement = in.nextInt();
        int result = linearSearchAlgorithm(array, findElement);
        if (result != -1) println("Element is at " + result + " position.");
        else println("Element not found.");
    }

    private static int linearSearchAlgorithm(int[] array, int find) {
        int temp = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == find) {
                temp = i;
                break;
            }
        }
        return temp;
    }

    private static void println(String message) {
        System.out.println(message);
    }
}