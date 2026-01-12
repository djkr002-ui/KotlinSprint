package org.example.Lesson_3

fun main() {
    val playerMoves: String = "D2-D4;0"

    val divisionWords = playerMoves.split('-',';')

    val fromWhere = divisionWords[0]
    val toWhere = divisionWords[1]
    val strokeNumber = divisionWords[2]

    println("Откуда: $fromWhere")
    println("Куда: $toWhere")
    println("Номер хода: $strokeNumber")
}