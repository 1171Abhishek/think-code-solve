/*Problem Statement
Find the Sum of Digits of a Number (without converting it to a string)
 */
fun sumOfDigits(n: Int): Int {
    var absNumber = if (n < 0) -n else n
    if (absNumber == 0) return 0

    var sum = 0
    while (absNumber > 0) {
        val digit = absNumber % 10
        sum += digit
        absNumber /= 10
    }

    return sum
}

fun main() {
    println(sumOfDigits(56))
}
