fun reverseFunction(originalString: String): String {
    var index = originalString.length - 1
    var reversedString = ""

    while (index >= 0) {
        reversedString += originalString[index]
        index--
    }
    return reversedString
}

fun main() {
    print("Enter : ")
    val userStringInput = readln()
    println(reverseFunction(userStringInput))
}

