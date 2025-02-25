/**  But I will not use it here

 * % 10 -> gives the last digit
 * / 10 -> removes the last digit
 */

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

