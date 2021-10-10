package javacode.problems.strings
/*
* Reference - https://www.java67.com/2017/07/string-rotation-in-java-write-program.html
* */
class CheckIfTowStringIsARotationOfEachOther {
    companion object{
        fun checkRotation(original : String, rotation : String): Boolean {
            if (original.length != rotation.length) return false

            val concatenate = original + original

            if (concatenate.indexOf(rotation) != -1){
                return true
            }
            return false
        }
    }
}

fun main() {
    val original = "IndiaVsAustralia"
    val original2 = "IndiaVsEngland"
    val rotationFalse = "AustraliaVsIndia"
    val rotationTrue = "EnglandIndiaVs"

    if (CheckIfTowStringIsARotationOfEachOther.checkRotation(original2, rotationTrue)){
        print("They are rotation of each other")
    }else {
        print("They are not rotation of each other")
    }

}