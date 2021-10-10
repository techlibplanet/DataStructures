package javacode.problems.arrays

class FindTheDuplicateElementInALimitedRangeArray {

    fun findDuplicateElement(array: IntArray): HashMap<Int, Int> {
        val hashMap = hashMapOf<Int, Int>()

        for (e in array) {
            if (hashMap.containsKey(e)) {
                var count = hashMap.getValue(e)
                hashMap[e] = count + 1
            } else {
                hashMap[e] = 1
            }
        }
        return hashMap
    }

    fun traverseHashMap(hashMap: HashMap<Int, Int>) {
        hashMap.forEach { (key, value) ->
            if (value != 1) {
                println("$key is the duplicate element and it appears $value times.")
            }
        }
    }
}

fun main() {
    //val array = intArrayOf(1, 2, 3, 4, 4)

    val array = intArrayOf(1, 2, 3, 4, 2, 3, 3)

    val duplicateElement = FindTheDuplicateElementInALimitedRangeArray()

    duplicateElement.traverseHashMap(duplicateElement.findDuplicateElement(array))

}