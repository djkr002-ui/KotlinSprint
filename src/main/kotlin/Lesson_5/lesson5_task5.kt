package org.example.Lesson_5

fun main() {
    val winningNumber1 = (0..42).random()
    val winningNumber2 = (0..42).random()
    val winningNumber3 = (0..42).random()

    println("Введите первое число (от 0 до 42):")
    val input1 = readln().toInt()

    println("Введите второе число (от 0 до 42):")
    val input2 = readln().toInt()

    println("Введите третье число (от 0 до 42):")
    val input3 = readln().toInt()

    val winningNumber = setOf(winningNumber1, winningNumber2, winningNumber3)
    val userNumbers = setOf(input1, input2, input3)

    val matchedNumbers = winningNumber.intersect(userNumbers)
    val matchCount = matchedNumbers.size

    when(matchCount) {
        0 -> println("К сожалению, вы не угадали ни одного числа.")
        1 -> println("Вы угадали одно число — вам полагается утешительный приз.")
        2 -> println("Вы угадали два числа — получаете крупный приз!")
        3 -> println("Поздравляем! Вы угадали все числа и выиграли джекпот!")
    }

    println("Выигрышные числа: $winningNumber")
}