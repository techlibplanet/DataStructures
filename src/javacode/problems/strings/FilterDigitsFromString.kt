package javacode.problems.strings

import java.lang.StringBuilder

class FilterDigitsFromString {

    companion object {

        fun filterDigits(stringArray: Array<String>): HashSet<String> {
            val hashSet = hashSetOf<String>()

            for (s in stringArray) hashSet.add(filterDigitsFromString(s))

            return hashSet
        }

        private fun filterDigitsFromString(input : String): String {
            val charArray = input.toCharArray()
            val digitString = StringBuilder()

            for (c in charArray) if (c.isDigit()) digitString.append(c)
            return digitString.toString()
        }
    }
}

fun main() {
    val stringArray = arrayOf("1234abc", "5679kh", "1098gshik", "9838sjab7d3b")

    print(FilterDigitsFromString.filterDigits(stringArray))
}