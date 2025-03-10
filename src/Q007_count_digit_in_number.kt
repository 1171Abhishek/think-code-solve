fun digitCount(n: Int) {
    var num = n
    var count = 0
    if (num == 0) {
        println("Digit Count is 1")
        return  // Using return means exiting the function immediately.
    }
    if (num < 0) {
        num *= -1
    }
    while (num > 0) {
        count++
        num /= 10   // removes the last digit
    }
    println("Count is $count")
}


fun main() {
    digitCount(-213)
}