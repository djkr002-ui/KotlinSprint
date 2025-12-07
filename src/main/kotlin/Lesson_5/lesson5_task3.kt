package org.example.Lesson_5

fun main() {
    val winningNumber1 = (0..42).random()
    val winningNumber2 = (0..42).random()

    println("Введите первое число (от 0 до 42):")
    val input1 = readln().toInt()

    println("Введите второе число (от 0 до 42):")
    val input2 = readln().toInt()

    if (winningNumber1 == input1 && winningNumber2 == input2 || winningNumber1 == input2 && winningNumber2 == input1) {
        println("Поздравляем! Вы выиграли главный приз")
    } else if (winningNumber1 == input1 || winningNumber2 == input2 || winningNumber1 == input2 || winningNumber2 == input1) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }
    println("Выигрышные числа: $winningNumber1 и $winningNumber2")
}