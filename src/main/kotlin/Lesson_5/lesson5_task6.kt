package org.example.Lesson_5

const val BMI_MIN = 18.5
const val BMI_AVERAGE = 25.0
const val BMI_MAX = 30.0

fun main() {

    println("Ведите ваш вес:")
    val weight = readln().toDouble()

    println("Ведите ваш рост:")
    val heightСm = readln().toDouble()

    val heightM = heightСm / 100.0
    val bmiFormula = weight / (heightM * heightM)
    println(String.format("Ваш ИМТ: %.2f", bmiFormula))

    when {
        bmiFormula < BMI_MIN -> println("Недостаточная масса тела")
        bmiFormula in BMI_MIN..<BMI_AVERAGE -> println("Нормальная масса тела")
        bmiFormula in BMI_AVERAGE..BMI_MAX -> println("Избыточная масса тела")
        bmiFormula >= BMI_MAX -> println("Ожирение")
    }
}