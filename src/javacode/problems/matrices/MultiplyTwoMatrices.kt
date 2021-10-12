package javacode.problems.matrices

class MultiplyTwoMatrices {
    companion object{
        fun multiplyTwoMatrices(array1: Array<IntArray>, array2 : Array<IntArray>): Array<IntArray> {
            val resultArray = arrayOf(IntArray(array1.size), IntArray(array2.size))

            for (i in array1.indices) for (j in array2.indices){
                resultArray[i][j] = array1[i][j] * array2[i][j]
            }

            return resultArray
        }
    }
}

fun main() {
    val arr1 = arrayOf(intArrayOf(1, 20), intArrayOf(13, 14))
    val arr2 = arrayOf(intArrayOf(3, 4), intArrayOf(5, 6))
    val multiply = MultiplyTwoMatrices.multiplyTwoMatrices(arr1, arr2)

    for (i in multiply) for (j in i){
        print("$j ")
    }
}