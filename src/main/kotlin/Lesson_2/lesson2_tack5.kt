package org.example.Lesson_2

fun main() {
    val initialAmount = 70000
    val annualRate = 16.7
    val year = 20

    val rateDecimal = annualRate / 100

    val futureValue = initialAmount * Math.pow(1 + rateDecimal, year.toDouble())

    println(String.format( "%.3f", futureValue))
}