/*
Problem Statement:
Write a function that converts a given non-negative integer n into its binary representation without using built-in
functions like .toBinaryString()
 */

/*
Here's a concise version for your notes:

### Steps to Convert Integer to Binary:
1. Divide the number by 2.
2. Record the remainder (0 or 1).
3. Divide the quotient by 2 again, recording the remainder.
4. Repeat until the quotient is 0.
5. Read the remainders in reverse order.

### Example: Convert 10 to Binary:
- 10 ÷ 2 = 5, remainder = 0
- 5 ÷ 2 = 2, remainder = 1
- 2 ÷ 2 = 1, remainder = 0
- 1 ÷ 2 = 0, remainder = 1

**Binary: 1010**


 */
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
