/*
Problem Statement:
Write a function in Kotlin that takes an integer n and returns the number of 1s in its binary representation.
 */
fun countOnesInBinary(n: Int): Int {
    var num = n
    var count = 0

    while (num > 0) {
        if (num % 2 == 1) {  // Check if last digit is 1
            count++
        }
        num /= 2  // Remove last digit
    }
    return count
}

fun main() {
    print("Enter a number: ")
    val userInput = readln().toInt()
    println("Number of 1s in binary: ${countOnesInBinary(userInput)}")
}
