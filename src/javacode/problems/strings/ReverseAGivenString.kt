package javacode.problems.strings

import java.lang.StringBuilder

class ReverseAGivenString {
    companion object{
        fun reverseString(input : String): String {
            val charArray = input.toCharArray()
            val stringBuilder = StringBuilder()

            for (i in charArray.indices.reversed()){
                stringBuilder.append(charArray[i])
            }

            return stringBuilder.toString()
        }

        fun reverseStringUsingRecursion(input: String): String {
            if (input.length < 2) {
                return input;
            }

            return reverseStringUsingRecursion(input.substring(1)) + input[0]
        }
    }
}

fun main() {
    val input = "Mayank"

    print(ReverseAGivenString.reverseStringUsingRecursion(input))
}