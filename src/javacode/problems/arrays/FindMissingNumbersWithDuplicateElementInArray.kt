package javacode.problems.arrays

class FindMissingNumbersWithDuplicateElementInArray {

    companion object{
        fun findMissingNumbersInArray(array: IntArray): IntArray {
            val tempArray = IntArray(array.size)

            for (i in array.indices){
                tempArray[array[i]] = 1
            }

            return tempArray
        }
    }
}

fun main() {
    val array = intArrayOf(1, 1, 2, 3, 5, 5, 7, 9, 9, 9)

    val resultArray = FindMissingNumbersWithDuplicateElementInArray.findMissingNumbersInArray(array)

    for (i in 1 until resultArray.size) {
        if (resultArray[i] == 0)
        print("$i ")
    }
}