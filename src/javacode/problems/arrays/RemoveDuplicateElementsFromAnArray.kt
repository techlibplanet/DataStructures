package javacode.problems.arrays

class RemoveDuplicateElementsFromAnArray {
    companion object {

        fun removeDuplicateElementFromArray(array: Array<Int>): IntArray {
            val size = array.size
            val tempArray = mutableListOf<Int>()
            for (i in 0 until size) {
                if (!tempArray.contains(array[i])){
                    tempArray.add(array[i])
                }
            }

            return tempArray.toIntArray()
        }
    }
}

fun main() {
    val array = arrayOf(1, 1, 2, 2, 3, 4,4, 5, 5)

    val resultArray = RemoveDuplicateElementsFromAnArray.removeDuplicateElementFromArray(array)

    resultArray.forEach {
        print("$it, ")
    }
}