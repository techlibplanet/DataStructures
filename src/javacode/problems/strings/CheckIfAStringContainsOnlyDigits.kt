package javacode.problems.strings

import java.util.regex.Pattern

class CheckIfAStringContainsOnlyDigits {

    companion object {
        fun findStringContainsNumber(input: Array<String>): HashMap<String, Boolean> {
            val pattern: Pattern = Pattern.compile(".*[^0-9].*")
            val hashMap = hashMapOf<String, Boolean>()

            for (s in input) {
                hashMap[s] = !pattern.matcher(s).matches()
            }

            return hashMap
        }
    }
}

fun main() {
    val input1 = "123"
    val input2 = "123456abc"
    val stringArray = arrayOf(input1, input2)

    print(CheckIfAStringContainsOnlyDigits.findStringContainsNumber(stringArray))
}