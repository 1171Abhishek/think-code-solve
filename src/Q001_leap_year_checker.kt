/*  Problem Statement:
    Write a function that determines if a given year is a leap year or not.
 */
fun leapYear(year: Int): String {
    return if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
        "$year is a leap year"
    } else {
        "$year is not a leap year"
    }
}

fun main() {
    print("Input: Year = ")
    val userYearInput = readln().toInt()
    println(leapYear(userYearInput))
}