package javacode.problems.arrays

class ReverseAnArray {

    companion object{
        fun reverseArray(array : IntArray): IntArray {
            val tempArray = IntArray(array.size)
            for ((j, i) in array.indices.reversed().withIndex()){
                tempArray[j] = array[i]
            }
            return tempArray
        }
    }
}

fun main() {
    val array = intArrayOf(101,102,103,104,105)

    val resultArray = ReverseAnArray.reverseArray(array)

    for (e in resultArray) print("$e ")
}