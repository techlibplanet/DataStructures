package javacode.problems.strings

class CountManyVowelsAndConsonantsInAGivenString {

    companion object{
        fun countVowels(input: String): HashMap<Char, Int> {
            val charArray = input.toCharArray()
            val vowels = charArrayOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
            val hashMap = hashMapOf<Char, Int>()

            for (c in charArray) {
                if (vowels.contains(c)) {
                    if (hashMap.containsKey(c)) {
                        val count = hashMap.getValue(c)
                        hashMap[c] = count + 1
                    } else hashMap[c] = 1
                }
            }

            return hashMap
        }
    }
}

fun main() {
    val input = "I Love You"

    print(CountManyVowelsAndConsonantsInAGivenString.countVowels(input))
}