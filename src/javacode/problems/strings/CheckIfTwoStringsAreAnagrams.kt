package javacode.problems.strings

import java.util.*

class CheckIfTwoStringsAreAnagrams {
    companion object{
        fun checkAnagrams(input1 : String, input2 : String): Boolean {
            val length1 = input1.length
            val length2 = input2.length

            if (length1 !=length2) return false

            val charArray1 = input1.toCharArray()
            val charArray2 = input2.toCharArray()

            Arrays.sort(charArray1)
            Arrays.sort(charArray2)

            for (i in 0 until length1){
                if (charArray1[i] != charArray2[i]) return false
            }

            return true
        }
    }
}

fun main() {
    val input1 = "testn"
    val input2 = "tets"

    if (CheckIfTwoStringsAreAnagrams.checkAnagrams(input1, input2)){
        print("The two strings are Anagram of each other")
    }else {
        print("The two strings aren't Anagram of each other")
    }
}