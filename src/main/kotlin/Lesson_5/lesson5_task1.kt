package org.example.Lesson_5

fun main() {
    val number1 = (1..9).random()
    val number2 = (1..9).random()

    println("Решите пример, для входа в систему:")
    println("Сколько будет $number1+$number2?")

    val userResponse = readln().toInt()

    if (userResponse == number1 + number2) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}