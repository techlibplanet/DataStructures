package javacode.problems.arrays

import java.util.*

class RemoveDuplicateElementsFromAnArray {
    companion object {

        // Using Mutable List
        fun removeDuplicateElementFromArray(array: IntArray): IntArray {
            val size = array.size
            val tempArray = mutableListOf<Int>()
            for (i in 0 until size) {
                if (!tempArray.contains(array[i])){
                    tempArray.add(array[i])
                }
            }

            return tempArray.toIntArray()
        }

        // Remove duplicate without using collection
        fun removeDuplicateWithoutUsingCollection(array : IntArray): IntArray {
            Arrays.sort(array)
            var previous = array[0]
            val result = IntArray(array.size-1)
            result[0] = previous

            for (i in 1 until array.size){
                if (array[i]!=previous){
                    result[i] = array[i]
                }
                previous = array[i]
            }
            return result

        }

        fun removeAtIndex(arr: IntArray, index: Int): IntArray {
            return if (index < 0 || index >= arr.size) {
                arr
            } else (arr.indices)
                .filter { i: Int -> i != index }
                .map { i: Int -> arr[i] }
                .toIntArray()
        }
    }
}

fun main() {
    val array = intArrayOf(1, 1, 2, 2, 3, 4,4, 5, 5)

    val resultArray = RemoveDuplicateElementsFromAnArray.removeDuplicateWithoutUsingCollection(array)

    resultArray.forEach {
        print("$it, ")
    }
}