/* ******* Question *******
Write a function that checks if a given integer x is a palindrome number. A number is considered a
palindrome if it reads the same forward and backward.

Number	Reversed	Palindrome?
121	       121	        Yes
-121	   121-	         No
10	        01	         No
1221	   1221	        Yes

*/

/**
 * % 10 -> gives the last digit
 * / 10 -> removes the last digit
 */


fun isPalindrome(x: Int):Boolean {
    var num = x
    if (num < 0) return false
    var reversed = 0
    while (num != 0) {
        val lastDigit = num % 10
        reversed = reversed * 10 + lastDigit
        num /= 10
    }

    return x == reversed

}


fun main() {
    println(isPalindrome(0))
}

