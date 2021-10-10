package javacode.problems.arrays

class CheckIfASubarrayWith0SumExistsOrNot {

    fun hasZeroSumSubArray(array: IntArray): Boolean {
        val set = hashSetOf<Int>()
        var sum = 0
        set.add(sum)
        for (i in array) {
            sum +=i

            if (set.contains(sum)){
                return true
            }

            set.add(sum)
        }
        return false
    }

    fun printMessage(message: String) {
        print(message)
    }
}

fun main(args: Array<String>) {
    val array = intArrayOf(3, 4, -7, 3, 1, 3, 1, -4, -2, -2)

    val check = CheckIfASubarrayWith0SumExistsOrNot()

   if (check.hasZeroSumSubArray(array)){
       check.printMessage("SubArray exist")
   }else {
       check.printMessage("SubArray does not exist")
   }

}