package org.example.Lesson_4

fun main() {
    val day = 6

    val todaysDay = day % 2 == 0

    println("Упражнения для рук:       ${todaysDay == false}\n" +
            "Упражнения для ног:       ${todaysDay == true}\n" +
            "Упражнения для спины:     ${todaysDay == true}\n" +
            "Упражнения для пресса:    ${todaysDay == false}")
}