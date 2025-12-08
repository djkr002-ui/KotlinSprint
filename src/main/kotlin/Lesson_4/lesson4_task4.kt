package org.example.Lesson_4

fun main() {
    val day = 6

    val todaysDay = day % 2 == 0

    println("Упражнения для рук:       ${!todaysDay}\n" +
            "Упражнения для ног:       ${todaysDay}\n" +
            "Упражнения для спины:     ${todaysDay}\n" +
            "Упражнения для пресса:    ${!todaysDay}")
}