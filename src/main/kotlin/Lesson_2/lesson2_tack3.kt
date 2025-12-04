package org.example.Lesson_2

const val SECONDS_PER_MINUTE = 60

fun main() {
    val departureHour= 9
    val departureMinute  = 39
    val travelTimeMinutes  = 457

    val departureTotalMinutes = departureHour * SECONDS_PER_MINUTE + departureMinute
    val arrivalTotalMinutes = departureTotalMinutes + travelTimeMinutes

    val arrivalHour = arrivalTotalMinutes / SECONDS_PER_MINUTE
    val arrivalMinute = arrivalTotalMinutes % SECONDS_PER_MINUTE

    println(String.format("%02d:%02d", arrivalHour, arrivalMinute ))
}