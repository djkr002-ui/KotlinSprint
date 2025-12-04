package org.example.Lesson_1

const val SECONDS_PER_MINUTE = 60
const val SECONDS_PER_HOUR = 3600

fun main() {
    val totalSeconds = 6480

    val hours = totalSeconds / SECONDS_PER_HOUR
    val remainingSeconds = totalSeconds % SECONDS_PER_HOUR
    val minutes = remainingSeconds / SECONDS_PER_MINUTE
    val seconds = remainingSeconds % SECONDS_PER_MINUTE

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}