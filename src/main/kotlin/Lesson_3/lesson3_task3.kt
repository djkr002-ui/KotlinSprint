package org.example.Lesson_3

fun main() {
    val number = 6

    val table = """
        $number * 1 = 6
        $number * 2 = 12
        $number * 3 = 18
        $number * 4 = 24
        $number * 5 = 30
        $number * 6 = 36
        $number * 7 = 42
        $number * 8 = 48
        $number * 9 = 54
       """.trimIndent()
    println(table)
}