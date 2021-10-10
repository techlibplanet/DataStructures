package javacode.problems.arrays

class FindLargestAndSmallestNumber {
    companion object {
        fun findLargestAndSmallestNumber(array: IntArray): Pair<Int, Int> {
            var largest = 0
            var smallest = 0

            for (n in array) {
                if (n > largest) {
                    largest = n
                } else if (n < smallest) {
                    smallest = n
                }
            }
            return Pair(smallest, largest)
        }
    }
}

fun main() {
//    val array = intArrayOf(-20, 34, 21, -87, 92, 2147483647)
    val array = intArrayOf(-147, 343, 621, -879, 92, 2147483647)

    print(FindLargestAndSmallestNumber.findLargestAndSmallestNumber(array))
}