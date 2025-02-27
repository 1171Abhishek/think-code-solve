fun binaryFunction(n: Int): String {
    if (n == 0) return "0"
    var num = n
    var binary = ""
    while (num > 0) {
        val remainder = num % 2
        binary = remainder.toString() + binary
        num /= 2
    }
    return binary

}

fun main() {
    println(binaryFunction(13))
}
