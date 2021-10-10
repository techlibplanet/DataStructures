package javacode.problems.strings

class PrintDuplicateCharactersFromString {

    companion object{
        fun printDuplicateCharacters(input: String): HashMap<Char, Int> {
            val charArray = input.toCharArray()
            val hashMap = hashMapOf<Char, Int>()

            for (c in charArray) {
                if (hashMap.containsKey(c)) {
                    val count = hashMap.getValue(c)
                    hashMap[c] = count + 1
                } else hashMap[c] = 1
            }

            return hashMap
        }
    }
}

fun main() {
    val string1 = "programming"
    val hashMap = PrintDuplicateCharactersFromString.printDuplicateCharacters(string1)
    hashMap.filter {
        it.value !=1
    }.apply {
        print(this)
    }

}