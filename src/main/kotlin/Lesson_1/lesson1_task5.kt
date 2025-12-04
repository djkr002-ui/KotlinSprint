package org.example.Lesson_1

fun main() {
    val totalSeconds = 6480

    val hours = totalSeconds / 3600
    val remainingSeconds = totalSeconds % 3600
    val minutes = remainingSeconds / 60
    val seconds = remainingSeconds % 60

    println("0${hours}:${minutes}:${seconds}0")
}