package javacode.problems.strings

class CountTheOccurrenceOfACharacterInAString {

    fun findOccurrenceUsingForLoop(input: String): HashMap<Char, Int> {
        val hashMap = hashMapOf<Char, Int>()
        val charArray = input.toCharArray()

        for (c in charArray) {
            if (hashMap.containsKey(c)) {
                var count = hashMap.getValue(c)
                hashMap[c] = count + 1
            } else {
                hashMap[c] = 1
            }
        }
        return hashMap
    }

    fun findOccurrenceUsingMap(input: String): HashMap<Char, Int> {
        val hashMap = hashMapOf<Char, Int>()
        val charArray = input.toCharArray()

        charArray.map { c ->
            if (hashMap.containsKey(c)) {
                var count = hashMap.getValue(c)
                hashMap[c] = count + 1
            } else {
                hashMap[c] = 1
            }
        }
        return hashMap
    }
}

fun main() {

    val word1 = "Programming"
    val word2 = "Combination"
    val word3 = "Java"

    val countOccurrence = CountTheOccurrenceOfACharacterInAString()

    print(countOccurrence.findOccurrenceUsingMap(word2))

}