/*
Problem Statement:
Write a function in Kotlin that takes an integer as input and counts the number of even and odd digits without
converting it to a string. The function should return a pair of two integers:
 */

fun countEvenAndOddDigits(n: Int): Pair<Int, Int> {
    var number = if (n < 0) -n else n // Work with absolute value
    var evenCount = 0
    var oddCount = 0

    if (number == 0) return Pair(1, 0) // Special case: 0 has one even digit

    while (number > 0) {
        val digit = number % 10
        if (digit % 2 == 0) {
            evenCount++
        } else {
            oddCount++
        }
        number /= 10
    }

    return Pair(evenCount, oddCount)
}

fun main() {
    val (even, odd) = countEvenAndOddDigits(-2048)
    println("Even digits: $even, Odd digits: $odd") // Output: Even digits: 3, Odd digits: 1
}
