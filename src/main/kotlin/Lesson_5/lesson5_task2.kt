package org.example.Lesson_5

const val AGE_OF_MAJORITY = 18

fun main() {
    val currenYear = 2025
    val yearOfBirth = readln().toInt()

    if ((currenYear - yearOfBirth) >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    }
}