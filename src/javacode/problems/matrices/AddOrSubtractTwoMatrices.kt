package javacode.problems.matrices

class AddOrSubtractTwoMatrices {
    companion object{

        fun findSumOfMatrices(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
            val resultArray = arrayOf(IntArray(arr1.size), IntArray(arr2.size))

            for (i in arr1.indices) for (j in arr2.indices) resultArray[i][j] = arr1[i][j] + arr2[i][j]

            return resultArray
        }

        fun findSubtractionOfMatrices(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
            val resultArray = arrayOf(IntArray(arr1.size), IntArray(arr2.size))

            for (i in arr1.indices) for (j in arr2.indices){
                resultArray[i][j] = arr1[i][j] - arr2[i][j]
            }

            return resultArray
        }
    }
}

fun main() {
    val arr1 = arrayOf(intArrayOf(1, 20), intArrayOf(13, 14))
    val arr2 = arrayOf(intArrayOf(3, 4), intArrayOf(5, 6))
    val addition = AddOrSubtractTwoMatrices.findSumOfMatrices(arr1, arr2)
    val subtraction = AddOrSubtractTwoMatrices.findSubtractionOfMatrices(arr1, arr2)

    print("Addition of matrices\n")
    for (i in addition){
        for(j in i){
            print("$j ")
        }
    }


    print("Subtraction of matrices\n")

    for (i in subtraction){
        for(j in i){
            print("$j ")
        }
    }
}