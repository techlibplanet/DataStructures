package javacode.problems.strings

class PrintFirstNonRepeatedCharacterFromString {

    // LinkedHashMap - it maintains insertions order of entries during iteration.

    companion object {
        fun findFirstNonRepeatedInteger(input : String): HashMap<Char, Int> {
            val charArray = input.toCharArray()
            val hashMap = linkedMapOf<Char, Int>()

            for (c in charArray){
                if (hashMap.containsKey(c)){
                    val count = hashMap.getValue(c)
                    hashMap[c] = count +1
                }else {
                    hashMap[c] = 1
                }
            }

            return hashMap
        }
    }
}

fun main() {

    val string1 = "pprogramming"

    val hashMap = PrintFirstNonRepeatedCharacterFromString.findFirstNonRepeatedInteger(string1)

    for (v in hashMap){
        if (v.value == 1){
            print("First non repeating Integer is - ${v.key}")
            break
        }
    }

}