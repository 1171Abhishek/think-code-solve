/*
Write a function in Kotlin that takes an integer as input and reverses its digits without converting it to a string.
The function should return the reversed number as an integer.
 */

fun reverseDigit(n: Int): Int {
    var number = n
    var reversedNumber = 0
    val sign = if (number < 0) -1 else 1  // Store sign

    number *= sign  // Make number positive for processing

    while (number > 0) {
        val digit = number % 10
        reversedNumber = reversedNumber * 10 + digit
        number /= 10
    }

    return reversedNumber * sign  // Restore original sign
}

fun main() {
    println(reverseDigit(100))  // Output: 1
    println(reverseDigit(-9807)) // Output: -7089
}
