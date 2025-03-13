/*
Problem Statement:
Write a function in Kotlin that takes an integer as input and returns true if the sum of its digits is an even number,
otherwise returns false.
 */

fun sumDigitEvenOrOdd(n: Int): Pair<Int , Boolean> {
    var digitSum = 0
    val sign = if (n < 0) -1 else 1
    var number = n * sign

    while (number > 0){
        val rem = number % 10
        digitSum +=  rem
        number /= 10
    }

    return Pair(digitSum*sign , digitSum*sign %2 == 0)

}
fun main() {
    print("Enter digit here: ")
    val userDigitInput = readln().toInt()
    val (digitSum , evenOrOdd) = sumDigitEvenOrOdd(userDigitInput)
    println("Digit sum of $userDigitInput is $digitSum and it is ${if (evenOrOdd) "even" else "odd"}")
}