package javacode.problems.arrays

class CalculateAverageOfAllNumbersInArray {

    companion object {
        fun calculateAverageOfAllNumbers(array : IntArray): Float {
            val n = array.size
            var sum = 0
            for (e in array){
                sum+=e
            }
            return sum/n.toFloat()
        }
    }
}

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5, 6)

    print(CalculateAverageOfAllNumbersInArray.calculateAverageOfAllNumbers(array))
}