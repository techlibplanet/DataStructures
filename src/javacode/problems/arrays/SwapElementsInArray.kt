package javacode.problems.arrays

class SwapElementsInArray {

    companion object{
        fun swapElementsInArray(array : IntArray, i : Int, j : Int): IntArray {
            val temp = array[i]
            array[i] = array[j]
            array[j] = temp

            return array
        }
    }
}

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5, 6)

    val result = SwapElementsInArray.swapElementsInArray(array,1,5)

    for (e in result) print("$e ")
}