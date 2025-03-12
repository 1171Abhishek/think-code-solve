/*
Problem Statement:
    Write a function in Kotlin that takes an integer as input and reverses its digits without converting it to a string.
    The function should return the reversed number as an integer, maintaining its sign.
 */
fun reverseIntegerFunction(n: Int):Int{
    val numberSign = if (n < 0) -1 else 1
    var number = n*numberSign
    var reversedNumber = 0

    while (number > 0){
        val lastDigit = number % 10
        reversedNumber = reversedNumber * 10 + lastDigit
        number /= 10
    }
    return reversedNumber*numberSign
}

fun main() {
    println(reverseIntegerFunction(-456))
}