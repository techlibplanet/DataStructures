package javacode.problems.strings

class CheckIfTheGivenStringIsPalindrome {

    companion object{

        /*
        * Reverse any of the string from 2 input string
        * Check if they both are equal
        * */

        fun isPalindrome(input1 : String): Boolean {
            val reverseString = reverseString(input1)

            if (input1 != reverseString) return false

            return true
        }

        private fun reverseString(input: String): String {
            if(input.length <2) return input

            return reverseString(input.substring(1)) + input[0]
        }
    }
}

fun main() {
    val input1 = "abbcba"

    if (CheckIfTheGivenStringIsPalindrome.isPalindrome(input1)){
        print("string are palindrome")
    }else{
        print("string aren't palindrome")
    }
}