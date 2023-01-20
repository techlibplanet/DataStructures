package javacode.problems.matrices

class TransposeAMatrix {
    companion object{

        //1 2 3
        //4 5 6
        //7 8 9

        fun transposeMatrix(array1 : Array<IntArray>): Array<IntArray> {
            val tempArray = arrayOf(IntArray(3), IntArray(3))


            return tempArray
        }
    }
}

fun main() {
    val array = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6),intArrayOf(4, 5, 6))
    val result = TransposeAMatrix.transposeMatrix(array)

    for (i in result) for (j in i){
        print("$j ")
    }
}