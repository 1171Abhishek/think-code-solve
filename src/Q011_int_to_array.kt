/*  Problem Statement:
Write a function in Kotlin that takes an integer as input and returns an array of its digits in the same order.
Do not convert the number to a string.
*/

import kotlin.math.pow

fun storeDigits(num: Int): IntArray {
    var absNumber = if (num < 0) -num else num
    var temp = absNumber
    var digitCount = 0

    // Step 1: Count the number of digits
    while (temp > 0) {
        digitCount++
        temp /= 10
    }

    val newArray = IntArray(digitCount)  // Create array of exact size
    var index = 0  // Start from the first position

    // Step 2: Extract digits from left to right
    while (digitCount > 0) {
        val divisor = 10.0.pow(digitCount - 1).toInt()
        newArray[index] = absNumber / divisor  // Get first digit
        absNumber %= divisor  // Remove first digit
        digitCount--
        index++
    }

    return newArray
}

fun main() {
    println(storeDigits(123).joinToString())  // Output: 1, 2, 3
    println(storeDigits(907).joinToString())  // Output: 9, 0, 7
}
