package org.example.Lesson_2

const val MINUTE_PER_HOUR = 60

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTimeMinutes = 457

    val departureTotalMinutes = departureHour * MINUTE_PER_HOUR + departureMinute
    val arrivalTotalMinutes = departureTotalMinutes + travelTimeMinutes

    val arrivalHour = arrivalTotalMinutes / MINUTE_PER_HOUR
    val arrivalMinute = arrivalTotalMinutes % MINUTE_PER_HOUR

    println(String.format("%02d:%02d", arrivalHour, arrivalMinute))
}