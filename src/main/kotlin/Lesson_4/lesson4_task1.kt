package org.example.Lesson_4

fun main() {
    val totalNumberOfTables = 13

    val tablesToday = 13
    val tablesTomorrow = 9

    val availableToday = tablesToday < totalNumberOfTables
    val availableTomorrow = tablesTomorrow < totalNumberOfTables

    println("[Доступность столиков на сегодня: $availableToday],\n" + "[Доступность столиков на завтра: $availableTomorrow].")
}