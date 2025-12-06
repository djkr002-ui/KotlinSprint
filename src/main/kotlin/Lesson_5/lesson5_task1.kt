package org.example.Lesson_5

fun main() {
    val a = (1..9).random()
    val b = (1..9).random()

    println("Решите пример, для входа в систему:")
    println("Сколько будет $a+$b?")

    val userResponse = readln().toInt()

    if (userResponse == a + b) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}