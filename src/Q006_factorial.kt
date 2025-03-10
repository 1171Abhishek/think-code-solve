// Calculate factorial using recursion
fun factorialUsingRecursion(n: Int): Int {
    return if (n < 0) {
        -1
    } else if (n == 0) {
        1
    } else {
        n * factorialUsingRecursion(n - 1)
    }
}

// Calculate factorial using loop
fun factorialUsingLoop(n: Int): Int {
    var num = n
    var initialValue = 1
    return if (num < 0) {
        -1
    } else if (num == 0) {
        1
    } else {
        while (num > 0) {
            initialValue *= num
            num--
        }
        initialValue
    }
}

fun main() {
    println(factorialUsingRecursion(-5))
    println(factorialUsingLoop(-5))
}