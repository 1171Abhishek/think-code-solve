import kotlin.math.sqrt

/*
Problem Statement
Write a function in Kotlin that takes an integer n and returns true if the sum of its digits is a prime number,
otherwise return false
 */

fun isDigitSumPrime(n: Int): Pair<Int, Boolean> {
    var number = n
    var sumOfDigits = 0

    while (number > 0) {
        val lastDigit = number % 10
        sumOfDigits += lastDigit
        number /= 10
    }

    // Function to check if a number is prime
    fun isPrime(num: Int): Boolean {
        if (num < 2) return false  // 0 and 1 are not prime
        for (i in 2..sqrt(num.toDouble()).toInt()) {  // Check divisibility up to sqrt(num)
            if (num % i == 0) return false
        }
        return true
    }

    return Pair(sumOfDigits, isPrime(sumOfDigits))
}

fun main() {
    println(isDigitSumPrime(123)) // Example test
}
