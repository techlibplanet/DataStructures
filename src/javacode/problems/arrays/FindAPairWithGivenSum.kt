package javacode.problems.arrays

import kotlin.collections.HashMap

/*
* Find a pair with the given sum in an array
Given an unsorted integer array, find a pair with the given sum in it.

For example,

Input:

arr = [8, 7, 2, 5, 3, 1]
sum = 10

Output:

Pair found (8, 2)
or
Pair found (7, 3)


Input:

arr = [5, 2, 6, 8, 1, 9]
target = 12

Output: Pair not found
*/

class FindAPairWithGivenSum {

    /*Pair with the sum of 10 is - 8 & 2
    Pair with the sum of 10 is - 7 & 3*/

    var iterations = 0

    //    Complexity O(n2)
    fun pairWithTheGivenSumUsingTraditionalMethod(array: IntArray, sum: Int) {
        for (i in array.indices) {
            for (j in i + 1 until array.size) {
                if (array[i] + array[j] == sum) {
                    printMessage("Pair with the sum of $sum is - ${array[i]} & ${array[j]}\n")
                }
                iterations++
            }
        }
        printMessage("\n")
        printMessage("Total iterations - $iterations\n")
    }

    //    Complexity o(n)
    fun findPairWithHashMap(array: IntArray, sum: Int) {
        val pairs = hashMapOf<Int, Int>()
        for (i in array) {
            val difference = sum -i
            if (pairs.containsKey(difference)){
                print("$i + $difference = $sum\n")
            }
            pairs[i] = i
            iterations++
        }
    }

    // Complexity O(n)
    fun findPairWithHighOrderFunction(array: IntArray, sum: Int): List<Pair<Int, Int>> {
        val pairs = hashMapOf<Int, Int>()
        return array.map {
            val difference = sum -it
            if (pairs.containsKey(difference)){
                return@map Pair(it, difference)
            }
            pairs[it] = it
            null
        }.filterNotNull()
    }


    fun printMessage(message: String) {
        print(message)
    }
}

fun main(args: Array<String>) {
//    1st Problem
//    var array = intArrayOf(8, 7, 2, 5, 3, 1)
//    val sum = 10

//    2nd Problem
    var array = intArrayOf(5, 2, 6, 8, 1, 9, 6, 3)
    val sum = 12
    val pair = FindAPairWithGivenSum()
//    pair.findPairWithHashMap(array, sum)

    pair.pairWithTheGivenSumUsingTraditionalMethod(array, sum)

//    print(pair.findPairWithHighOrderFunction(array, sum))

}